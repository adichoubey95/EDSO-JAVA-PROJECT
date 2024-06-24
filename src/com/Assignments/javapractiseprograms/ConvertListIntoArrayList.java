package com.Assignments.javapractiseprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertListIntoArrayList {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Aditya");
        linkedList.add("Sohan");
        linkedList.add("Rohit");
        linkedList.add("Sonali");
// converting LinkedList into ArrayList
        ArrayList<String> arrayList=new ArrayList<>(linkedList);
        for(Object a:arrayList){
            System.out.println(a);
        }
    }

    }

