package com.Assignments.javapractiseprograms;

import java.util.Scanner;

public class SwappingWithoutThird {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int x= scanner.nextInt();
        int y= scanner.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x+" "+y);
    }
}
