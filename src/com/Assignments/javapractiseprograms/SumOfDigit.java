package com.Assignments.javapractiseprograms;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        int n,r,sum=0;
        System.out.println("enter any no");
        Scanner scanner=new Scanner(System.in);
       n= scanner.nextInt();
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
