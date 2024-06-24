package com.Assignments.javapractiseprograms;

import java.util.Scanner;

public class CountUcaseLcaseBlankSpace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string");
        int l;
        String s=scanner.nextLine();
        System.out.println(s.length());
         char c;
         int blankSpace=0;
         int lowerCase=0;
         int upCase =0;
        for( int i=0;i<s.length();i++){
            c=s.charAt(i);// character extract
            if(c>='A' && c<'Z'){
                upCase++;
            }else if (c>='a' && c<'z'){
                lowerCase++;
        } else if (c==' ') {
                blankSpace++;

            }
        }
        System.out.println(upCase);
        System.out.println(lowerCase);
        System.out.println(blankSpace);
    }
}
