package com.accessmodifier;

public class AccessOutsideClass {
    public static void main(String[] args) {



  /*   / BasicAccessModifier bAm= new BasicAccessModifier();
       System.out.println(bAm.i);
        bAm.method1();*/

        DefaultAccessModifier DaM=new DefaultAccessModifier(); // dam runs outside the class but for the same package.
        System.out.println(DaM.a);
        DaM.method2();
    }
}
