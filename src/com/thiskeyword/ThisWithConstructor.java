package com.thiskeyword;

public class ThisWithConstructor {
    ThisWithConstructor(){
        this(10,20);// this keyword is always use as first statement.
        System.out.println("hello");
    }

    ThisWithConstructor(int a, int b){
        this(20,30,40);
        System.out.println("hello"+(a+b));
    }
    ThisWithConstructor(int c, int d ,int e){
        System.out.println("hello"+(10+20+30));
    }

    public static void main(String[] args) {
        ThisWithConstructor twc= new ThisWithConstructor();

    }
}


