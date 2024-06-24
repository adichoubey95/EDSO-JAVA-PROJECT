package com.javamethod.concept;
class Test{
    static int value; // static variable
}
public class StaticVariable {


    static  int i=10; //static Variable
    static int marks; //static Variable

    public static void main(String[] args) {

        System.out.println(i);//calling of static variable within the same class
        marks=300; //calling of static variable within the same class
        System.out.println(marks);

        Test obj=new Test();// object 1
        Test obj1=new Test();//object 2
        obj.value=100; //calling the Test class Variable through object creation in different class.
        obj1.value=200;

        System.out.println(obj.value);
        System.out.println(obj1.value);

        Test.value=400; //calling the Test class Variable directly by class name in different class.
        Test.value=500; //latest value of the object will come because every obj is sharing the same value.


        //



    }
}
