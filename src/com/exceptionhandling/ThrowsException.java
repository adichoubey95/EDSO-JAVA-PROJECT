package com.exceptionhandling;

public class ThrowsException {

    public static void voting(int age) throws Exception{ // it is define in method signature
        if (age > 18) {
            System.out.println("user is eligible for vote..");
        }
        else {
            throw new Exception("user is not available for voting");
        }
    }

    public static void main(String[] args) throws Exception {
        voting(16);
    }
}
