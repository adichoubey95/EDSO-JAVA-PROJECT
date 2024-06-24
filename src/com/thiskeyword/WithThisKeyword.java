package com.thiskeyword;

public class WithThisKeyword {
    int a,b;
    WithThisKeyword(int a, int b){
        this.a=a;
       this.b=b;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        WithThisKeyword wtk=new WithThisKeyword(10,20);
        wtk.display();
    }
}
