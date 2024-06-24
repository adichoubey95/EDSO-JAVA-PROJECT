package com.oops.polymorphism.overloading;

public class OverloadingExample {
    void add(int a){
        System.out.println("a = "+ a);}
    void add(int a, int b){
        System.out.println("a+b = "+ (a+b));}
    double add(double a){
        System.out.println("a = "+ a);
        return a*a;
    }
    double add(int a, double b){
        System.out.println("a+b = "+ (a+b));
        return a+b;}
    double add(double a, int b){
        System.out.println("a+b = "+(a+b));
        return a+b;}


    public static void main(String[] args) {
        OverloadingExample ole= new OverloadingExample();
        ole.add(10);
        ole.add(10,20);
        double result=ole.add(5.5);
        double res=ole.add(2,5.5);
        System.out.println(res);
        double re=ole.add(5.5,1);
        System.out.println("re = "+ re);
        System.out.println("result ="+ result);
    }

}
