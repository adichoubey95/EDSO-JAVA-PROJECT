package com.Assignments.javapractiseprograms;

import java.util.Scanner;

public class SwapingTwoNo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       //System.out.println("enter the no");
        int x;
        x=scanner.nextInt();
        int y=scanner.nextInt();
        int z;
        System.out.println("Before swapping " + x+ " " + y);
        z=x;
        x=y;
        y=z;
        System.out.println("After Swapping " + x + " " + y);
    }
}
