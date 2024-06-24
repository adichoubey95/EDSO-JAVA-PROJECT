package com.constructor;

public class RectangleConstructor {
    int length;
    int width;
    RectangleConstructor(int length, int width){
        this.length=length;
        this.width=width;
    }
     int calculateArea(){
         return length*width;
    }

    public static void main(String[] args) {
        RectangleConstructor rc=new RectangleConstructor(20,  40);
        System.out.println("area of rectangle " + rc.calculateArea());


    }
}
