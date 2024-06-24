package com.Assignments.javapractiseprograms;

import java.util.Scanner;

public class FindEvenOddNo {
    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if (i%2!=0){
            System.out.println("odd no");
        }else{
            System.out.println("even no");
        }
    }
}
