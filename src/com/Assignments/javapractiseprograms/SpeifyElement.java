package com.Assignments.javapractiseprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SpeifyElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("shashi");
        arrayList.add("rahul");
        arrayList.add("somya");
        System.out.println(arrayList.contains("rahul"));
        System.out.println(arrayList.contains("mona"));


        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"aditya");
        hashMap.put(2,"rohan");
        hashMap.put(3,"amit");

        System.out.println(hashMap.containsValue("amit"));
        System.out.println(hashMap.containsValue("adi"));
        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsKey(4));


    }
}
