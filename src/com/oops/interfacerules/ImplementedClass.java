package com.oops.interfacerules;

public class ImplementedClass implements Herobike,Hondabike{ //implement keyword is used for relation between class and interface

    @Override
   public void performance(){
        System.out.println("performance");
    }

    @Override
    public void defaultMethod() {
        Herobike.super.defaultMethod();  // syntax Herobike interface. super keyword. default method
        Hondabike.super.defaultMethod(); // Using the override method to call the default method which is common for both herobike and hondabike but have different implementation
    }

    public static void main(String[] args) {
        ImplementedClass IC=new ImplementedClass();
        IC.performance();
        System.out.println(Herobike.x);   // calling of instance variable in impelemented class and syntax is interfacename.instance variable
        System.out.println(Hondabike.y);
        IC.defaultMethod();  // calling of th default method
        Herobike.staticMethod(); // Calling of static method:Syntax interface.static method name
        Hondabike.staticMethod();// The static method is connected to either the class or the interface and
        // have no connection with the child class hence we do not create any overridden method for the static method
    }
}
