package com.javamethod.concept;

class Integer{
    int addtion() { // instance method without parameter
        int i = 10, j = 20;// local variable
        int z = i + j;
        return z;

    }
    String fName(){  //instance method without parameter returning string
        String s="Aditya";// local variable
        return s;

    }
    int multiply(int a){ // instance method without parameter
        int p=a*a;
        return p;
    }

    String lname(String s){  // instance Method with parameter retuning string.
        String str=s;
        return str;
    }

}

public class InstanceMethodWithReturnValue {
    public static void main(String[] args) {
      Integer obj =new Integer();//object of the outside class
        System.out.println("Addition "+ obj.addtion()); // calling of instance method without parameter.
        //System.out.println(obj.multiply(20)); // calling of instance method with parameter
        int r= obj.multiply(30);// other way of calling the instance method with return type.
        System.out.println("Multiplication "+ r);

        System.out.println("First name: "+ obj.fName());// calling of instance method without parameter.
        String lastname= obj.lname("Choubey");
        System.out.println("Lastname: " + obj.lname(lastname));//other way of calling the instance method with String return type
    }

}
