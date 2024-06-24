package com.javamethod;

import com.accessmodifier.DefaultAccessModifier;

public class OutsideClass {
    public static void main(String[] args) {
        DemoMethod1 dm1= new DemoMethod1();
        dm1.method(10,20);
        int mul= dm1.method2(20,30);  // calling of non static method with return type
        System.out.println(mul);
        DemoMethod1.method3(3,2); //calling of static method outside the class by class name.

//        DefaultAccessModifier DaM=new DefaultAccessModifier();
//        System.out.println(DaM.a);
//        DaM.method2();
    }
}
