package com.superkeyword;

public class SuperExample {
    int maxSpeed=200;
    void engine(){
        System.out.println("car engine");
    }
    void colour(){
        System.out.println("black");
    }
    SuperExample(int rpm){
        System.out.println(rpm);
    }
}
class Bike extends SuperExample
{
    int maxSpeed=180;
    void display(){
        super.colour();
        System.out.println(super.maxSpeed);
    }
    Bike(int rpm){
        super(rpm);
    }
    void engine(){
        super.engine();
        System.out.println("bike  engine");
    }
    public static void main(String[] args) {
        Bike bk=new Bike(1000);
        bk.display();
        bk.engine();

    }
}