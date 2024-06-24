package com.accessmodifier;

public class BasicAccessModifier {

   private int i=10;// it is visible only in the class.
    private void method1(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        BasicAccessModifier bAm= new BasicAccessModifier();
        System.out.println(bAm.i);
        bAm.method1();
    }
}
