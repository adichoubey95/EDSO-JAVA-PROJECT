package com.literal;

public class IntegralTypeLiteral {
    public static void main(String[] args) {

    int x=10; // decimal literal
    int y=010; //octal literal , preffix 0, range 0-7
    int z=0X10; // hexadecimal literal , range 0-9,A to F.
       // int x8= 10l; invalid
        long l= 10L; //valid
        long l1=10;// valid
        byte b= 127;// valid
       // byte b1= 128; // invalid out of range
        short s1= 32767; // valid in range
      //  short s2= 32768;// invalid out of range
        System.out.println(x +" "+y+" "+z);// jvm will give by default decimal literal value



        /*int x1=0777;//valid
        int x2=0786; // in valid out of range in octal.
        int x3=0XFACE; valid (within range in hexadecimal)
        int x4=0xbeef; valid in range
        int x5=0xBeer; invalid out of range.
        int x6=0Xabb2cd; valid in (range).
        int x7= 10.0; invalid
        */
}}
