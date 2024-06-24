package com.oops.inheritance;


class Student{
   public void study(){
       System.out.println("studying");
   }
}
class Science extends Student{
    public void science() {
        System.out.println("science work");
    }
}
class Arts extends Student{
    public void arts(){
        System.out.println("arts work");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Science sc= new Science();
        Arts ar= new Arts();
        sc.science();
        ar.arts();
    }
}
