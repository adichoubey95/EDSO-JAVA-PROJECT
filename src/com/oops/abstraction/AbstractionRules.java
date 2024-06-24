package com.oops.abstraction;

public abstract class AbstractionRules {  // This is the abstraction class, abstract keyword is necessary to create abstract class

   int a;
    AbstractionRules(int a){
        this.a=a;

    }
    public abstract  void abstractMethod(); // This is th abstract method which does not have any implementation and abstract keyword is necessary for abstract method
    // Under abstract class we can define all the other methods i.e., concrete(normal), static, final, and also constructors
   public void concrete(){
       System.out.println("concrete method");
   }

   public  static void staticMethod(){
       System.out.println("static method");
   }
    public final void finalMethod(){
     System.out.println("final method");
   }
}

class AbstractChildDemo extends AbstractionRules{ // This is the child class through which we do implementation and call all the methods of the parent class by creating the child class object

     public  void abstractMethod(){
        System.out.println("abstract method implementation");
    }
    AbstractChildDemo(int a){  // Child class constructor to call the parent class constructor using super keyword
         super(a);
        System.out.println(a);
    }

    public static void main(String[] args) {
        AbstractChildDemo aCd=new AbstractChildDemo(100);
        aCd.abstractMethod();//CALLING
        aCd.concrete();
        aCd.finalMethod();
        staticMethod();

    }


}

