package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(10,"aditya");// put method is used to add object
        map.put(null,"rakesh");
        map.put(30,"rohit");
        map.put(40,"aman");
        map.put(50,"aditya");// duplicate value allowed
        map.put(50,"arati"); // duplicate key not allowed
        map.put(70, "null");// we can add null value

// •	If the key is already present, then old values will be replaced with new values


        System.out.println(map.get(10));// with the help of get method we can call the value.

        
        System.out.println(map);
        for(Map.Entry a: map.entrySet()){
            System.out.println(a.getKey()+ " "+a.getValue());
        }

    }
}
