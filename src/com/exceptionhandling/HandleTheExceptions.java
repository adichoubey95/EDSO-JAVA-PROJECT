package com.exceptionhandling;

public class HandleTheExceptions {
    public static void main(String[] args) {
        System.out.println("hello");
        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException a) {    //Object creation is done inside catch
            a.printStackTrace();         // method used to print the exception details
        }
        System.out.println("Aditya");
        System.out.println("Priyanshi Love");
    }
}


