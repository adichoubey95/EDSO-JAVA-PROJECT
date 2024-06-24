package com.exceptionhandling.rules;

public class Rule5 {
    public static void main(String[] args) {

        // rule 5:  if we have multiple statements in the try block but if we gwt error on 2nd statement te try block will be
       // terminated and the 3rd statement will not be executed.
        try{
            System.out.println("aditya ");
            System.out.println(10/0);
            System.out.println("adi");
            System.out.println("choubey");
            System.out.println("hi");
        }catch(ArithmeticException a){
            a.printStackTrace();
        }
    }
}
