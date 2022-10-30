package com.naim.serialization;

import java.io.*;

public class SerializaitonClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.firstName = "oiuyt";
        student.lastName = "doe";
//        student.schoolName = "Mapple Leaf";
//
////        student.address = "dhanmondi";
//        student.city = "dhaka";

        try{
            FileOutputStream fileout = new FileOutputStream("./student.txt");
            ObjectOutputStream out =  new ObjectOutputStream(fileout);
            out.writeObject(student);
            out.close();
            fileout.close();
            System.out.println("serialized data is saved in ./student.txt file");

        } catch (IOException i) {
            i.printStackTrace();
            }
        }
}
