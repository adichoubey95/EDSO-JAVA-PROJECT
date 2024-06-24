package com.oops.abstraction;
abstract class MyTest
    {
        abstract void calculate(int a, int b);// abstract method
    }

class Addition extends MyTest
    {
        void calculate(int a, int b) //implementation of abstract class
        {
            int x = a + b;
            System.out.println("sum;" +x);
        }
    }
    class Subtraction extends MyTest
    {
        void calculate(int a, int b)
        {
            int y = a - b;
            System.out.println("sub" +y);
        }
    }
     class Multiplication extends MyTest
    {
        void calculate(int a, int b)
        {
            int z = a * b;
            System.out.println("multiply" +z);
        }
    }
    public class AbstractionExample1 {
        public static void main(String[] args)
        {
            Addition a = new Addition();
            Subtraction s = new Subtraction();
            Multiplication m = new Multiplication();
            a.calculate(20, 30);
            s.calculate(10, 5);
            m.calculate(10, 20);
        }}
