package com.collection.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet= new HashSet();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
       //
        hashSet.add(null); //we can add null value also.we cannot add multiple null value.


        System.out.println(hashSet); // insertion order not presered and duplicate value not allowed , in the output duplicate value will not come.
        hashSet.remove(30);
        System.out.println(hashSet);



    }
}
