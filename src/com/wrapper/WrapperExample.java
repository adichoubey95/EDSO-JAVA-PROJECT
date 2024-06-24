package com.wrapper;

public class WrapperExample {
    public static void main(String[] args) {
        int i= 100;// primitive data types
        Integer integer= i; //converted into wrappper class// autoboxig
        System.out.println(integer);

        int x=integer; // automatic unboxing// assinging the wrapper class value into primitive data type
        System.out.println(x);

    }
}
