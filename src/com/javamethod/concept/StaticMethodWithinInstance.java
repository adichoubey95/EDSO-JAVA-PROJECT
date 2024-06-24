package com.javamethod.concept;
class Test4{
    static  void add() { //static method
        int i = 10, j = 20;//local variable
        int z = i + j;
        System.out.println(z);
    }

        void display(){// instance method within same class.
            add(); // calling of static method within instance method.,no need to create the object of the class.
        }
}
class Test5{
    void display2(){
        Test4.add(); //calling of static method within new class instance method by classname.
    }
}
public class StaticMethodWithinInstance {
    public static void main(String[] args) {
        Test4 ob=new Test4();
        ob.display();
    }
}
