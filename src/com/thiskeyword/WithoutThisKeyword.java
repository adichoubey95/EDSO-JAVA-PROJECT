package com.thiskeyword;

public class WithoutThisKeyword {

    int a,b;
    WithoutThisKeyword(int a, int b){
        a=a;
       b=b;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        WithoutThisKeyword wth= new WithoutThisKeyword(10,20);
       wth.display();
    }
}
// if the instance variable name and parameter name will same so the ambiguity will create and default value(0) will assign.
// so this keyword will solve the ambiguity.
