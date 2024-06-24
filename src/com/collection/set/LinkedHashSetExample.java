package com.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet lhs= new LinkedHashSet();
        lhs.add("aditya");
        lhs.add("akash");
        lhs.add("anuj");
        lhs.add("shashi");
        lhs.add("rakesh");
       // lhs.add("rakesh"); no error will come and duplicate value will also not come.

        System.out.println(lhs);// it preserve the insertion order. and it does not allow the duplicate value
        boolean b=lhs.contains("aditya");
        System.out.println(b);

        boolean b1=lhs.contains("arti");
        System.out.println(b1);
    }
}
