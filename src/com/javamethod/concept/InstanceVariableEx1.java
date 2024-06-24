package com.javamethod.concept;

public class InstanceVariableEx1 {


    int rollno=10; //instance Variable
    int marks; // instance Variable

    public static void main(String[] args) {
        InstanceVariableEx1 obj=new InstanceVariableEx1();
        InstanceVariableEx1 obj1=new InstanceVariableEx1();

        obj.marks=200;
        obj1.marks=300;
        System.out.println(obj.marks); //calling of instance Variable
        System.out.println(obj.rollno);//calling of instance Variable.
        System.out.println(obj1.marks);
        System.out.println(obj1.rollno);
// value is changing object to object
    }
}
