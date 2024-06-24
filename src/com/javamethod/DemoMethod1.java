package com.javamethod;

public class DemoMethod1 {

    int j=20; //instance variable


    static int i=10;// static  variable
    static void method3(int x, int y){  //static method
        System.out.println(x-y);
        System.out.println(i);// calling of static variable inside static  method
        //System.out.println(j);// calling of instance variable inside static  method is not possible at all.

    }
    public  void method(int a, int b){    //instance method with 0 return type
        System.out.println("method1"+ (a+b));
        System.out.println(i);//calling of static variable inside normal method is also possible .
        System.out.println(j); // calling of instance variable inside normal method is possible
    }


    public int method2(int a,int b){     // instance method with return type
      //  System.out.println(a*b);
        return a*b;
    }

    public static void main(String[] args) { // main method
        DemoMethod1 dm1= new DemoMethod1();
        dm1.method(10,20);// calling of instance method without return type
        dm1.method(20,30);
        dm1.method(50,60);


        System.out.println(dm1.j); // calling of instance variable can be done only with the help of object.

       int mul= dm1.method2(20,30);  // calling of instance method with return type
        System.out.println(mul);

        System.out.println(i);  //1)calling  of static variable
        // 2)we can directly call the static varible in the same class but in diffrent class we will have to call by classname or obect name.
        method3(3,2);  // calling OF static method under static method



    }
}
