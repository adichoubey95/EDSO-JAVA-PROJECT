package com.constructor;

public class PrivateConstructor {

   private PrivateConstructor(){
        System.out.println("private constructor");
    }

    public static void main(String[] args) {
        PrivateConstructor pvtcons=new PrivateConstructor();
        // when we have to apply the restriction on the user for creating the object we use private constructor.
        // we can access within the class only.
    }
}
