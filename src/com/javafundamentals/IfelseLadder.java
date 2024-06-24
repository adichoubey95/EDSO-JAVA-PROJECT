package com.javafundamentals;

public class IfelseLadder {
    public static void main(String[] args) {
        int marks=95;
        if(marks<65)
        {
            System.out.println("average");
        } else if (marks<75) {
            System.out.println("Good");
        } else if (marks<=100) {
            System.out.println("very good");
        }
        else
            System.out.println("fail");
    }

}
