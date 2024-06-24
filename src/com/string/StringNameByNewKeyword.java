package com.string;

public class StringNameByNewKeyword {
    public static void main(String[] args) {


        String s1 = "edso"; // string literal // and this object will create in scp.
        String s2 = new String("edso"); //string object //object will create in heap memory
        System.out.println(s1==s2);//  address of both the objects is different.
        System.out.println(s1.equals(s2));// content will be same.
    }
}
