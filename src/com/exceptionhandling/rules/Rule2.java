package com.exceptionhandling.rules;

public class Rule2 {
    public static void main(String[] args) {

        // rule2 the exception always use try & catch block.
        try{
            System.out.println(10/0);
        }catch(ArithmeticException a){
            a.printStackTrace();}
        System.out.println("hello");

        }
    }

