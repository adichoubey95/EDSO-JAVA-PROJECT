package com.exceptionhandling.rules;

public class Rule10 {
    public static void main(String[] args) {
        // rule:
       // We can use Java finally block with try and catch block.

        try{
            System.out.println(10/0);
        }catch(NullPointerException n)
        {
            n.printStackTrace();
        }finally {
            System.out.println("this is the finally block");
        }
        System.out.println("hello");
    }
}
