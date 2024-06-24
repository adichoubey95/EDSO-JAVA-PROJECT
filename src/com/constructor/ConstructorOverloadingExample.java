package com.constructor;

public class ConstructorOverloadingExample {

    int i; // instance variable
    int j;// instance variable
    float h;// instance variable
    boolean f;// instance variable
    //based on no of parameters.
    //based on the types of parameters.
    ConstructorOverloadingExample(int marks){// parameterised constructor
        i=marks;
        System.out.println(i);
    }
    ConstructorOverloadingExample(int age,float per){// parameterised constructor
        j= age;
        h=per;
        System.out.println(j);
        System.out.println(h);
    }
    ConstructorOverloadingExample(boolean radiobutton,int marks, int age, float per){// parameterised constructor
        f=radiobutton;
        i=marks;
        j=age;
        h=per;
        System.out.println(f);
        System.out.println(i);
        System.out.println(j);
        System.out.println(h);
    }
    public static void main(String[] args) {

        ConstructorOverloadingExample obj=new ConstructorOverloadingExample(100);
        ConstructorOverloadingExample obj1=new ConstructorOverloadingExample(25,95.5f);
        ConstructorOverloadingExample obj2=new ConstructorOverloadingExample(true,200,25,98.2f);

    }
}
