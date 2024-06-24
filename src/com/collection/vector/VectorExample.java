package com.collection.vector;


import java.util.ArrayList;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add("aditya");
        vector.add("Aman");
        vector.add("Akshay");
        vector.add('c');
        vector.add(null);
        vector.add("aditya");
        vector.add(true);
        vector.add(10.4f);

        System.out.println(vector);
    }
}
