package com.accessmodifier;

public class DefaultAccessModifier {
    int a=10; // the member without keyword are called default modifier and it can acces only within a pakage.
    void method2(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        DefaultAccessModifier DaM=new DefaultAccessModifier();
        System.out.println(DaM.a);
        DaM.method2();
    }
}
