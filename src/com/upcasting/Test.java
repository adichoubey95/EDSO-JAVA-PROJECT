package com.upcasting;

class PolymorphismDemoClass {
    void m1(String x) {
        System.out.println("One");
    }
}
class PolymorphismDemoClassChild extends PolymorphismDemoClass {
    public void m1(String x) {
        System.out.println("Two");
        super.m1(null);
    }
}
public class Test {
    public static void main(String[] args){
        PolymorphismDemoClass obj = new PolymorphismDemoClassChild();
        obj.m1(null);
    }
}

