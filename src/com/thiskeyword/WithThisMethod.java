package com.thiskeyword;

public class WithThisMethod {

    public void method1(){
        System.out.println("method1");
        this.method2();
    }

    public void method2()
    {
        System.out.println("method2");
        this.method3();
    }
    public void method3(){
        System.out.println("method3");
         //this.display();//  we can use this keyword but it is not recommended for static method
        display();// it is recommanded for static method

    }

    static void display(){
        System.out.println("method4");
        //we can not use this keyword in static block or static method.
    }

    public static void main(String[] args) {
        WithThisMethod wtm=new WithThisMethod();
        wtm.method1();
}

}
