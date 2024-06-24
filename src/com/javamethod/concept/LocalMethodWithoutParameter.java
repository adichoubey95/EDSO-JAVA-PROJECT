package com.javamethod.concept;

public class LocalMethodWithoutParameter {

    void display(){   // instance method without parameter
        int i=10;     // instance vriable
        System.out.println(i);
    }

    public static void main(String[] args) {// calling of instance method under static method or main method.
        LocalMethodWithoutParameter obj=new LocalMethodWithoutParameter();
        obj.display(); // calling of instance method
        System.out.println("Aditya Choubey");
    }


}
