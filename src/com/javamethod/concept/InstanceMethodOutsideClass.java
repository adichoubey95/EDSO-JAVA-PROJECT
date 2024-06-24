package com.javamethod.concept;
class Addtion{
    void addition(int a, int b){// declaration instance method in new class.
        int i=a; //local varible
        int j=b;//local varible
        int z=a+b;//local varible
        System.out.println(z);
    }

}
public class InstanceMethodOutsideClass {
    public static void main(String[] args) {
        Addtion obj =new Addtion(); //object creation of new class.
        obj.addition(10,20);// calling of instance method with parameter under static method
        System.out.println("Aditya Choubey");
    }
}
