package com.oops.polymorphism.overloading;

public class OverloadingRules {

void addition(int a, int b){
    System.out.println(a+b);

}
//void addition(int a, int b ,int c){ // by changing the parameter
//    System.out.println(a+b+c);
//}

    int addition(int a, int b ,int c){ // by changing the return type we cannot perform overloading
        //System.out.println(a+b+c);
        return(a+b+c);
    }
void addition(int a, float b){
    System.out.println(a+b);
}

public static void staticMethod(int a, int b){
    System.out.println(a+b);
}

    public static void staticMethod(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        OverloadingRules OLR=new OverloadingRules();
        int r= OLR.addition(3,4,5);
        System.out.println(r);
        OLR.addition(2,5);
        OLR.addition(5, 6,5);
        OLR.addition(3,5.5f);
        staticMethod(4,5);
        staticMethod(4,6,8);

    }

       public static void main(int a){
        System.out.println(a=10);
    }


}
