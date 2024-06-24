package com.exceptionhandling.rules;

public class Rule4 {
    public static void main(String[] args) {

        // rule 4 : we can use single try and multiple catch block
        try{
            System.out.println(10/0);
        } catch(ArithmeticException a){
            a.printStackTrace();
        } catch(NullPointerException n){
            n.printStackTrace();}
    }
}
