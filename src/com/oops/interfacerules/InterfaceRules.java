package com.oops.interfacerules;

public interface InterfaceRules {

    int i = 300; // by default it is public static final because it does not allow constructor

     public abstract void abstractMethod();// in interface we can only use abstract method, no concrete method
// by default abstract,public

    // we can not create the object of interface beacuse there is no implementation
}
