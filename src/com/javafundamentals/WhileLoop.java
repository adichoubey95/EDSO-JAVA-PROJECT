package com.javafundamentals;

public class WhileLoop {
    public static void main(String[] args) {
        int i=1,sum=0;

//        while(i<=10)
//        {
//            System.out.println("good");
//            i++;
////        }
//        while(i<=10)
//        {
//            sum=sum+i;
//            i++;
//        }
//        System.out.println(sum);
        int num=123,count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println(count);

    }
}
