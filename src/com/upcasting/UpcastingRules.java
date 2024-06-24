package com.upcasting;

public class UpcastingRules {// parent  class
    int i=10; //instance varible
    void addition(int a, int b){
        System.out.println( a*b);
    }
    void normalMethod(){// parent class non overridden method
        System.out.println("hello");
    }
}
class ChildUpcast extends UpcastingRules {
    int i = 20;//child class instance variable

    void addition(int a, int b) {// overridden method
        System.out.println(a + b);
    }
    void exampleDemo()// child class non overridden method
    {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        UpcastingRules ChUp= new ChildUpcast(); // upcasting
        System.out.println(ChUp.i);//calling parent class instance variabe
        ChUp.addition(10,20);// through upcasting we can call overridden method
        ChUp.normalMethod(); // we are calling parent class method which is not overridden
        // we can not call parent class method which is overridden.
       //ChUp.exampleDemo(); we can not call child class method through upcasting.

    }
}
/* through upcasting we can call only
1) parent class instance variable.
2) overriden method
3)parent class normal method  */

