package com.Assignments.javapractiseprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("aditya");
        arrayList.add("shubham");
        arrayList.add("shalini");
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
