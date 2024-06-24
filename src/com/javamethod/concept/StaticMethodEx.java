package com.javamethod.concept;

class Multiply{
    static int multiply(int a){
        int z=a*a;
        return z;
    }
}

public class StaticMethodEx {

    static  void add(){ //static method
        int i=10,j=20;
        int z=i+j;
        System.out.println(z);
    }
    public static void main(String[] args) {
        add(); //calling of static method within same class
        int mul=Multiply.multiply(20);//caliing of static method withon different class
        System.out.println(mul);//we can call with help of object of that class but it is not recommanded.
    }
}
