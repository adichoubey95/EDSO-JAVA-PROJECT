package com.oops.interfacerules;
interface Vehicle {

    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicle{
    int speed;
    int gear;
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }
    @Override
    public void speedUp(int increment){

        speed = speed + increment;
    }
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}
public class InterfaceExample1 {
    public static void main(String[] args) {
    Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        System.out.println("Bicycle present state :");
        bicycle.printStates();
}}

