package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("aditya");
        arrayList.add("Aman");
        arrayList.add("Akshay");
        arrayList.add('c');
        arrayList.add(null);
        arrayList.add("aditya");
        arrayList.add(true);
        arrayList.add(10.4f);
       // System.out.println(arrayList);

     /*   for(Object s: arrayList){
            System.out.println(s);
        }
*/
       /* Iterator iterator  =arrayList.iterator(); // downcasting has done.
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/


        System.out.println(arrayList.size());
        for (int i=0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));

        }

       // System.out.println(arrayList.get(4));

    }
}
