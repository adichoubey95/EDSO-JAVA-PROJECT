package com.Assignments.javapractiseprograms;

import java.util.Scanner;

public class FindPrimeNo{
    public static void main(String[] args) {
        int n;
        int count =0;

        System.out.println("enter any no");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0)
            {
                count++;
            }
        }
            if(count==2)
            {
                System.out.println("Entered no is prime no");
            }
            else{
                System.out.println("entered no is not prime no");
            }

        }

    }

