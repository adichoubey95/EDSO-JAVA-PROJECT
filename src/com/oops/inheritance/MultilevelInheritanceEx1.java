package com.oops.inheritance;
class Father1{
    int a, b;
    void getData(int x, int y){
        a=x;
        b=y;
    }
}
class Son1 extends Father1{
    int c=10;
    int add(){
        int sum=a+b+c;
        return sum;
    }
}
class Grandson extends Son1{
    int d=30;
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(add());
    }
}
public class MultilevelInheritanceEx1 {
    public static void main(String[] args) {
        Grandson obj=new Grandson();
        obj.getData(10,20);
        System.out.println(obj.add());
        obj.display();
    }

}
