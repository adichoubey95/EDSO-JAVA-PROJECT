package com.exceptionhandling.rules;

public class Rule11 {
    public static void main(String[] args) {
        //rule 11 Java finally block will execute when we will get an
        // exception and you handle that exception.
        try{
            System.out.println(10/0);
        }catch(NullPointerException n)
        {
            n.printStackTrace();
        }finally {
            System.out.println("this is the finally block");
        }
    }
}
