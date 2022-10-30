package com.naim.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {
    public static void main(String[] args) {
        Student student = null;
        try {
            FileInputStream fileIn = new FileInputStream("./student.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            student = (Student) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Student class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserializing Studdent .......");
        System.out.println("First Name of Student: " + student.firstName);
        System.out.println("Last Name of Student: " + student.lastName);
        System.out.println("School Name: " + student.schoolName);
        System.out.println("City Name: " + student.city);
        System.out.println("School Address: " + student.address);
        //System.out.println("Education: " + student.education);
    }
}
