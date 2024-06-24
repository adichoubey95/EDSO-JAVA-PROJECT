package com.exceptionhandling;

public class ThrowException {
    public static void voting(int age) {
        if (age > 18) {
            System.out.println("user is eligible for vote..");
        }
        else {
            throw new RuntimeException("user is not aviable for voting");
        }
    }

    public static void main(String[] args) {
        voting(16);
    }
}

