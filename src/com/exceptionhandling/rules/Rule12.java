package com.exceptionhandling.rules;

public class Rule12 {
    public static void main(String[] args) {
       //rule12:
        // Java finally block is executing if you won't handle the exception

        try{
            System.out.println(10/0);
        }finally {
            System.out.println("this is the finally block");
        }
    }
}
