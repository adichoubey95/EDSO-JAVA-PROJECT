package com.oops.polymorphism.overloading.overriding;
class Vehicle{
    void engine(){
        System.out.println("this is vehicle engine");
    }
}
class Bike extends Vehicle{
    void engine(){
        System.out.println ("this is bike engine");
    }
}
class Car extends Vehicle{
    void engine(){
        System.out.println ("this is car engine");}
}
public class  OverridingExample {
    public static void main(String[] arg) {
        Bike honda = new Bike ();
        honda.engine();
        Car benz = new Car ();
        benz.engine ();
    }
}
