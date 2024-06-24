package com.exceptionhandling;

public class ExceptionExample1 {
    public static void main (String[] args) {
        try{
            System.out.println(3/0);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally executed");
        }

        System.out.println("end");
    }
}

