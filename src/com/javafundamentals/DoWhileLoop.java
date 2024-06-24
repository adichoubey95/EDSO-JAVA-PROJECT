package com.javafundamentals;

public class DoWhileLoop {
    public static void main(String[] args) {
        //int a=1;
//        do {
//            System.out.println("hello aditya");
//            a++;
//        }
//        while(a>5);
int a=21 ,sum=0;

do {
sum=sum+a;
a--;
}
while(a>10);
        System.out.println(sum);
    }
}
