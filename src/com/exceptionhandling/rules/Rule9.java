package com.exceptionhandling.rules;

public class Rule9 {
    public static void main(String[] args) {
        // rule9:
        //We can define try block without catch block  but we need to use finally block

        try{
            System.out.println(10/0);
        }finally {
            System.out.println("this is the finally block");
        }

    }
}
