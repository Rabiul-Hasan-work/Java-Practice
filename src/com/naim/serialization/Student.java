package com.naim.serialization;

import java.io.Serializable;

public class Student extends  superStudent implements  variableConstant
{
    public String firstName;
    private static final long serialVersionUID = 213214521;
}

class superStudent implements Serializable {
    public String firstName;
    private static final long serialVersionUID = 213214521;
    public String lastName;
    static String schoolName = "zxcvb";
    transient final String address = "asdf";
    static transient String city = "poiuy";
}

//interface variableConstant {
//    public static final String education = "Edexcel";
//}