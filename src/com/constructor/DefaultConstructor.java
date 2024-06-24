package com.constructor;

public class DefaultConstructor {
 int a;
    DefaultConstructor()
    {
      a=200;
        System.out.println(a);
    }

    public static void main(String[] args) {
        DefaultConstructor dfc= new DefaultConstructor();
        //System.out.println(dfc.a);

    }
}
