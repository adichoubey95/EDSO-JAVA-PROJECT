package com.literal;

public class FloatingTypeLiteral {
    public static void main(String[] args) {
        float f=123.456f;// valid
        //float f=123.456; invalid
        double d=123456.254545; //by default floating type literal are double type.
       // double D= 0x123.456; invalid
       // float  f1= 123.456D; invalid
        double d1=0xface; //valid in range
        double d2=0xbeef; //valid in range
       // double d3=0786; // invalid (it will consider as integral and error is too largevalue)
        double d4= 0777777; // valid but it will be considered as integra literal because there is no decimal point
        double d5= 0777.0; // VALID floating point literal as decimal present
        double d6= 0786.0; // valid floating point literal treated as decimal
      //  double d7= 0xFace.0// invalid as there is a decimal point (malformed floating point literal)
        double d7= 10e2; // valid (exponential value 10 x 10square=1000.0)
       // float f2= 10e2; // invalid (f not there)
        float f3= 10e2f; // valid f is present
        double d8= 1.3e2; // valid
        System.out.println(d1+" " +d2+" " +d+" " +f);


    }
}
