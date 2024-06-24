package com.finalkeyword;

public class FinalBlankVariable {

     final int i;  //initializing the final blank variable
    final static int j; // static variable
    static int z;
    int k;
    FinalBlankVariable(){
        System.out.println(i=400);//until we assign a value to the blank final variable we will gt=et compile time error
        System.out.println(k=20);
        System.out.println(z=200);
    }

    static{
        j=500;// we can decalre the only final static variable.
      //  k=600; under static block we can only initialize the static variables.
    }

    public static void main(String[] args) {
        FinalBlankVariable FBV=new FinalBlankVariable();
       // System.out.println(FBV.i);
      //  System.out.println(FBV.k);
        System.out.println(j); //calling static variable
    }
}
