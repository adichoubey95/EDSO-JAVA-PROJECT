package com.collection.linkedlist;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
       // LinkedList<Integer> linkedList= new LinkedList<>();
        LinkedList linkedList= new LinkedList(); // object class will use in foreach loop.
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);
        linkedList.add(700);
        linkedList.add("hello");

        linkedList.addFirst("vishal"); // we can insert and delete object in the middle of process.
        linkedList.addLast("aditya");
        linkedList.removeFirst();// we can remove the values also.
        linkedList.removeLast();

      //  System.out.println(linkedList.getFirst()); calling of first and last object
       // System.out.println(linkedList.getLast());
       // System.out.println(linkedList);when we have to call the valuses in the form of value so we simply use the sout.

       for(Object i:linkedList){ // when we have to call values not in the form of array so we use for each loop.
            System.out.println(i);

        }

    }
}
