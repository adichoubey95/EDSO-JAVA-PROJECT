package com.Assignments.javapractiseprograms;

import java.util.HashMap;
import java.util.Map;

public class HashmapIteration {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("1","aditya");
        hashMap.put("2","rohan");
        hashMap.put("3","amit");

        System.out.println(hashMap);
        for(Map.Entry a: hashMap.entrySet()){
            System.out.println(a.getKey()+ " " + a.getValue());
        }

    }
}
