package com.finalkeyword;

public class FinalMethodClass {

    public final void marriage(){
        System.out.println("Arrange marriage");
    }}

class ChildClass extends FinalMethodClass {
/*
        public void marriage() {   // this method cannot be overridden as we are using the final method in the parentclass
       System.out.println("Love marriage");
  }*/
       public static void main (String[]args){
               ChildClass CC = new ChildClass();
               CC.marriage();
            }}


