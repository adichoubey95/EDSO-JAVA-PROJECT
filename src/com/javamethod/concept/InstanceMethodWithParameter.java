package com.javamethod.concept;

public class InstanceMethodWithParameter {


    void disp(int a, int b){// instance method with parameter
        int i=a; //local varible
        int j=b;//local varible
        int z=a+b;//local varible
        System.out.println(z);

    }
    public static void main(String[] args) {
        InstanceMethodWithParameter obj=new InstanceMethodWithParameter();
        obj.disp(10,20); //calling of instance method in static method.
        System.out.println("Aditya Choubey");
    }
}
