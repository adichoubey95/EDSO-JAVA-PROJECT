package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAddAll {
    public static void main(String[] args) {
        ArrayList arrayList1=new ArrayList();

        Collections.addAll(arrayList1,20,30,"aditya", 'a');

        arrayList1.remove(2);
        arrayList1.removeAll(arrayList1);
        System.out.println(arrayList1);


/*
        //arrayList1.clear(); to clear the elements of the array.

        ArrayList arrayList2=new ArrayList();
        Collections.addAll(arrayList2,20,30,"aditya", 'a');

        System.out.println(arrayList1.containsAll(arrayList2));// it checks all the object is present or not.

        System.out.println(arrayList1.equals(arrayList2)); // it checks the content in the array

        System.out.println(arrayList1.isEmpty());

        System.out.println(arrayList1.contains("adfkwehfew")); // to heck the weather the element is present or not.
       System.out.println(arrayList1);*/

    }
}
