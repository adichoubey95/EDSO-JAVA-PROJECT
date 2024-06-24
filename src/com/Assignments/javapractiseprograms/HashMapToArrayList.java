package com.Assignments.javapractiseprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapToArrayList {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("1","aditya");
        hashMap.put("2","rohan");
        hashMap.put("3","amit");

        List<String> arrayList=new ArrayList<String>(hashMap.keySet());
        System.out.println("keys");
        for(String i:arrayList){
            System.out.println(i);
        }

        ArrayList<String> nameList=new ArrayList<>(hashMap.values());
        System.out.println("values");
        for(String s:nameList){
            System.out.println(s);
        }

    }
}
