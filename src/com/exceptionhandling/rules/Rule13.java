package com.exceptionhandling.rules;

public class Rule13 {
    public static void main(String[] args) {
        // rule13 Java finally block is executing if you won't get any exception.

        try{
            System.out.println(10/10);
        }finally {
            System.out.println("this is the finally block");
        }
    }
}
