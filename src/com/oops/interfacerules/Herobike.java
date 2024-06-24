package com.oops.interfacerules;

public interface Herobike {
    int x= 100;
    void performance();

    default void defaultMethod(){
        // In the abstract method we need to implement all the methods in the implemented class to solve
        // this issue the default method has been provided which is java 1.8.
        System.out.println("Default mthod of herobike");
    }

    public static void staticMethod(){
        System.out.println("This is static method of herobike");
    }

    private void privateMethod(){
        System.out.println("private method of the herobike");// java1.9 version feature
    }

    public static void main(String[] args) {
        // we can not crate the object of interface
    }


}


