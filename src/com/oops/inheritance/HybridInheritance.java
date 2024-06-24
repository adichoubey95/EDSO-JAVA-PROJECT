package com.oops.inheritance;

class Company{
    public void Services(){
        System.out.println("Using company services");
    }
}
class Production extends Company {
    public void manufacturer(){
        System.out.println("doing production");
    }
}
class StoreDept extends Production{
    public void storage(){
        System.out.println("storing items for Production");
    }
}
class Quality extends Production{
    public void quality(){
        System.out.println("checking quality product");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Quality qua=new Quality();
        StoreDept sto=new StoreDept();
        sto.storage();
        qua.quality();
    }
}
