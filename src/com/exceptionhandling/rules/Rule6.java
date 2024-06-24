package com.exceptionhandling.rules;

public class Rule6 {
    public static void main(String[] args) {

        // rule 6: When we don't know about which exception to define, in this case we directly define Exception
        try{
            System.out.println(10/0);
        } catch(Exception a){
            a.printStackTrace();
    }
}}
