package com.collection.arraylist;

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
       // /generic

        //it is introduced in java version 1.7 .

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("aditya");
        arrayList.add("Aman");
        arrayList.add("Akshay");
        arrayList.add("santosh");
        arrayList.add("Priyanshi");
        arrayList.add("aditya");
        arrayList.add("Rahul");
      //  arrayList.add(10); in generics we can only add homogenous data.

        System.out.println(arrayList);
    }
}
