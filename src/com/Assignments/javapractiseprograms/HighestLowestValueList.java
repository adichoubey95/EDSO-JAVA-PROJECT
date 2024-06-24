package com.Assignments.javapractiseprograms;

import java.util.Collections;
import java.util.LinkedList;

public class HighestLowestValueList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(44);
        linkedList.add(55);
        linkedList.add(88);
        linkedList.add(2);

       // using collections class method
        System.out.println(Collections.max(linkedList));
        System.out.println(Collections.min(linkedList));
/*
        //sorting the collection and sort the first and last element
        Collections.sort(linkedList);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get((linkedList.size()-1)));*/

    }


}
