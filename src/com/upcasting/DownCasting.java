package com.upcasting;
public class DownCasting {
    int i = 300;
    void demoMethod() {
        System.out.println("hello");
    }
    void addition(int a, int b) {
        System.out.println(a * b);
    }
    public static void subtract(int a, int b) {
        System.out.println(a - b); }
}
class ChildDownCasting extends DownCasting {
    int i= 500;
    void addition(int a, int b) {
        System.out.println(a + b);
    }
    void nonOverriddenMethod(){
        System.out.println("hello world");
    }
    public static void multiply(int a, int b){
        System.out.println(a*b);}

    public static void main(String[] args) {
        DownCasting DC= new ChildDownCasting();  // upcasting
        System.out.println(DC.i);//  DC.nonOverriddenMethod(); // we canot call child class non overridden methods using upcasting
        DC.demoMethod();
       // ChildDownCasting ch= new  DownCasting(); // it is implicitly not possible to perform downcasting by dirclty crating a parent class object
       // Downcasting
        ChildDownCasting DC1= (ChildDownCasting)DC;
        DC1.nonOverriddenMethod();
        DC1.addition(6, 7);
        System.out.println(DC1.i);
        multiply(3,5);
        subtract(5,6);
    }
}
