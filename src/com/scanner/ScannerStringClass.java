package com.scanner;

import java.util.Scanner;

public class ScannerStringClass {
    public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            System.out.println("enter the valid string");

          //  String name= sc.nextLine();
        String name= sc.next();
        System.out.println(name.length());

            }
    }

