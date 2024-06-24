package com.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> map=new Hashtable<>();
        map.put(10,"aditya");// put method is used to add object
        map.put(20,"rakesh");
        map.put(30,"rohit");
        map.put(40,"aman");
        map.put(50,"aditya");// duplicate value allowed
        map.put(60,"arati"); // duplicate key not allowed
       // map.put(70, "null");// we cannot  add null value


        System.out.println(map.get(10));// with the help of get method we can call the value.


        System.out.println(map);// always return in descending order
        for(Map.Entry a: map.entrySet()){
            System.out.println(a.getKey()+ " "+a.getValue());
    }
}}
