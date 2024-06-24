package com.javamethod;

public class LocalVariable {

    public void normalMethod(){
        int a=10; // local variable cannot be declared as static variable
        System.out.println(a);
    }
    public static void staticMethod(){
        int b=51; // local variable cannot be declared as static
        System.out.println(b);
    }

    public static void main(String[] args) {
        LocalVariable localVariableExample= new LocalVariable();
        localVariableExample.normalMethod(); //for normal method we have to crete the object.
        staticMethod();// no need to create the object for static


    }
}
