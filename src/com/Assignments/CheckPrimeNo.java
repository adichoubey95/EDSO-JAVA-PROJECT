package com.Assignments;

public class CheckPrimeNo {
    public static void main(String[] args) {
        int n = 49; // let 49 is a prime no
        boolean prime = true;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime);
    }
}