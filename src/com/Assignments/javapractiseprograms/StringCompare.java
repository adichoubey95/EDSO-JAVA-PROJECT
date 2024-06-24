package com.Assignments.javapractiseprograms;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
       String s1= sc.next();
        System.out.println("enter second string");
        String s2=sc.next();
        if(s1.compareTo(s2)==0){
            System.out.println("strings are same");
        }else{
            System.out.println("strings are not same");
        }

    }
}
