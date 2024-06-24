package com.exceptionhandling.rules;

public class Rule14 {
    public static void main(String[] args) {

        // rule14:The finally block will not be executed if the program exit
        // (either by calling System.exit() or buy causing a fatal error that causes the process to abort
        try{
            System.exit(0);
        }catch(Exception n)
        {
            n.printStackTrace();
        }finally {
            System.out.println("this is the finally block");
        }
    }
}
