package com.oops.inheritance;

public class Father {
    public void business() {
        System.out.println("property");
    }
}
class Son extends Father {
    public void job() {
        System.out.println("doing job");

    }
}
class SingleInheritance{
    public static void main(String[] args) {
        Son ref= new Son();
        ref.business();
        ref.job();
    }
}





