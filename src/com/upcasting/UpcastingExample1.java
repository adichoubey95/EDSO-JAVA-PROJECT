package com.upcasting;

public class UpcastingExample1 {
    int i = 15;

    void sports() {
        System.out.println("all the properties of sports");
    }

    void score() {
        System.out.println("The score is 50");
    }
}

class Cricket extends UpcastingExample1 {
    int i = 12;

    void TestCricket() {
        System.out.println("India won test series");
    }

    void score() {
        System.out.println("The score is 400");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        UpcastingExample1 cric = new Cricket();// upcasting

        Cricket c1 = (Cricket) cric;// downcasting
        System.out.println(c1.i); // calling child class instance varible
        c1.TestCricket(); //  int ad= add(10,20); ,,,, calling child class instance method
       int i= (c1.add(10, 20)); //calling child class static method with return type.
        System.out.println(i);


        System.out.println(cric.i);//calling parent class instance variable
        cric.score();// calling over ridden method
        cric.sports();// calling parent class normal method
    }
}

