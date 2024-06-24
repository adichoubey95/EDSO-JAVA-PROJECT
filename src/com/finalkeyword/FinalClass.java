package com.finalkeyword;

public class FinalClass {
    final int a=300; // final variable is declared

  /* FinalClass(){ // we don't need a constructor as the final variable already has the value declared and it cannot be called again
    a=500;
   }*/


    public static void main(String[] args) {
        FinalClass FC=new FinalClass(); // calling of final variable
        System.out.println(FC.a);
    }
}
