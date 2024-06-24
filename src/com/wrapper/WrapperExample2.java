package com.wrapper;

public class WrapperExample2 {
    public static void main(String args[]){
        byte b=2;
        short s=42;
        int i=34;
        long l=40;
        float f=75.0F;
        double d=20.0D;
        char c='n';
        boolean b2=false;

        Byte byteobj=b;
        Short shortobj=s;
        Integer intobj=i;
        Long longobj=l;
        Float floatobj=f;
        Double doubleobj=d;
        Character charobj=c;
        Boolean boolobj=b2;

        System.out.println("---Printing object values---");
        System.out.println("Byte object: "+byteobj);
        System.out.println("Integer object: "+intobj);
        System.out.println("Short object: "+shortobj);
        System.out.println("Long object: "+longobj);
        System.out.println("Double object: "+doubleobj);
        System.out.println("Float object: "+floatobj);
        System.out.println("Boolean object: "+boolobj);
        System.out.println("Character object: "+charobj);
//Unboxing:
        byte bytevalue=byteobj;
        short shortvalue=shortobj;
        int intvalue=intobj;
        long longvalue=longobj;
        float floatvalue=floatobj;
        double doublevalue=doubleobj;
        char charvalue=charobj;
        boolean boolvalue=boolobj;
        
        System.out.println("---Printing primitive values---");
        System.out.println("byte value: "+bytevalue);
        System.out.println("int value: "+intvalue);
         System.out.println("short value: "+shortvalue);
        System.out.println("long value: "+longvalue);
        System.out.println("double value: "+doublevalue);
        System.out.println("float value: "+floatvalue);
        System.out.println("boolean value: "+boolvalue);
        System.out.println("char value: "+charvalue);
    }}


