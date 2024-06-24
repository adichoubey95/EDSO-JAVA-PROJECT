package com.oops.polymorphism.overloading.overriding;

public class OverridingRules {
    void education() {
        System.out.println("I want to become a Doctor");
    }
    public static void StaticMethod(){
        System.out.println("This is a static method");

    }
}

class Child extends OverridingRules{
    void education(){
        System.out.println("I want to become an Engineer");
    }
    public static void StaticMethod(){// we can not override the static method
        System.out.println("This is an overriden static method");

    }
    public static void main(String[] args) {
        Child Ch= new Child();
        Ch.education();
        StaticMethod();
    }

    public static void main(int a) {// we can not override the main method
        System.out.println(a);
    }
}
