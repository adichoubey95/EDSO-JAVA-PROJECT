package com.oops.interfacerules;

public interface Hondabike {
    int y= 200;
    void performance(); //without implementation

    default void defaultMethod(){
        // In the abstract method we need to implement all the methods in the implemented class to solve
        // this issue the default method has been provided which is java 1.8.
        System.out.println("Default method of hondabike");
    }
    public static void staticMethod(){
        System.out.println("This is static method of hondabike");
    }

    private void privateMethod(){
        System.out.println("private method of the hondabike");// java1.9 version feature and it can access within a class only.
    }

    // we cannot  use protected method in interface because it can access outside the  package.

    public static void main(String[] args) {
        // we con not cretae the object of interface
    }
}
