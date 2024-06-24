package com.exceptionhandling;

public class UncheckedException {
    public static void main(String[] args) {


        System.out.println("hello");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException a) {   //unchecked exception
            a.printStackTrace();
        }
        System.out.println("Aditya");
        System.out.println("Priyanshi Love");
    }
}

