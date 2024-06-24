package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add("aditya");
        arrayList.add("Aman");
        arrayList.add("Akshay");
        arrayList.add("santosh");
        arrayList.add("Priyanshi");
        arrayList.add("aditya");
        arrayList.add("Rahul");

       // Collections.sort(arrayList);// sorting in ascending order.
      //  System.out.print(arrayList);

        Collections.sort(arrayList,Collections.reverseOrder());// sorting in decreasing order
        System.out.println(arrayList);

    }
}
