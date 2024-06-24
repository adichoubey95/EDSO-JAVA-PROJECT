package com.Assignments.javapractiseprograms;

public class SwappingString {
    public static void main(String[] args) {
        String s1="Aditya"; // s1=Choubey after swap
        String s2="Choubey";// s2=Aditya after swap

        String s= s1+s2;//AdityaChoubey
        s2=s.substring(0,s.length()-s2.length());//Aditya
        s1=s.substring(s2.length());//Choubey
        System.out.println(s1+ " " + s2);
    }
}
