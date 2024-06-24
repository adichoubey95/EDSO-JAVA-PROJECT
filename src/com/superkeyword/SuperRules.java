package com.superkeyword;

public class SuperRules {
    int i=200;
    int j=300;

    SuperRules(int k){
        System.out.println("the value of k is: "+ k);
    }
    SuperRules(){
        System.out.println("parent class default constructor");
    }
    void method1(){
        System.out.println("hello");
    }
    void method2(){
        System.out.println("override method");
    }
}
class ChildSuperRules extends SuperRules{
    int i=300;

    ChildSuperRules(int k){
        super(k);// calling of parent class constructor with the help of super keyword.
    }
    ChildSuperRules(){
        super();//calling of parent default class constructor with the help of super keyword.
    }

    void show(){
        System.out.println(super.i);// calling of parent class instance varible with the help of super keyword
        System.out.println(super.j);// calling of parent class instance varible with the help of super keyword
        super.method1();// calling of parent class instace method with the help of super keyword.
    }
    void method2(){
        super.method2();// calling of parent class overriden method wit the help of superkeyword.
        System.out.println("overridden method");
    }


    public static void main(String[] args) {
        ChildSuperRules CsR=new ChildSuperRules(100); //caliing parent class parametrized constructor
        ChildSuperRules CsR1=new ChildSuperRules();//caliing parent class default constructor
        CsR.show();
        CsR.method2();

    }

}
