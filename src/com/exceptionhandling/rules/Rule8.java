package com.exceptionhandling.rules;

public class Rule8 {
    public static void main(String[] args) {
        // rule8:
        // We can define child class exception at top and parent class exception at the bottom.
        String name = "null";
        try {
            System.out.println(name.length());
        } catch (ArithmeticException a) {
            a.printStackTrace();
        } catch (NullPointerException n) {
            n.printStackTrace();
        } catch (Exception c) {
            c.printStackTrace();
        }
    }}
