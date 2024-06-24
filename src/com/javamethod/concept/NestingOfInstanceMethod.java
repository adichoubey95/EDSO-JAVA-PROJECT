package com.javamethod.concept;
class Test2 {
    int add() { // instance Method
        int i = 10, j = 20;
        int z = i + j;
       return z;
    }

    void display() {   // instance Method
        int x = add();// calling of instance method insode the instance method
        System.out.println(x);
    }
}
class Test3{
    void display2(){
        Test2 ob1=new Test2();
        ob1.display();//calling of instance method inside the instance method in next class.
        System.out.println("display2");
    }
}
public class NestingOfInstanceMethod {
    public static void main(String[] args) {
        Test2 ob=new Test2();
        Test3 ob3=new Test3();
        ob3.display2();
        ob.display();

    }
}
