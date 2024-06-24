package com.collection.set;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet treeSet= new TreeSet();
        treeSet.add("aditya");
        treeSet.add("akhil");
        treeSet.add("pankaj");
        treeSet.add("arti");
        treeSet.add("anay");
        treeSet.add("advik");

       // treeSet.add(100); class cast exception will occur,,,, no null, no insertion, no duplicate.


        Iterator iterator= treeSet.descendingIterator(); // arranging in decending order.
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



        /*

        System.out.println(treeSet);
        boolean b=treeSet.contains("aditya");
        System.out.println(b);
        boolean b1=treeSet.contains("Adi");
        System.out.println(b1);

        treeSet.pollFirst();
        System.out.println(treeSet);
        treeSet.pollLast();
        System.out.println(treeSet);*/

    }
}
