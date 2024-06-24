package com.constructor;

public class ParameterizedConstructor {
    int i; // instance variable
    ParameterizedConstructor(int a){ // parameterised constructor
        i=a;
        System.out.println(i);
    }

    public static void main(String[] args) {

        ParameterizedConstructor para= new ParameterizedConstructor(200);
        ParameterizedConstructor para1= new ParameterizedConstructor(300);
        ParameterizedConstructor para2= new ParameterizedConstructor(2400);
       // PrivateConstructor pvtcons=new PrivateConstructor();

    }

}
