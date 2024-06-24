package com.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no");

        int no= sc.nextInt();
        for(int i=0;  i <= no; i++){
            if(i%2==0){
                System.out.println(i);
            }

}
    }

}
