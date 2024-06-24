package com.collection.stack;

import java.util.Stack;
import java.util.Vector;

public class StackExample {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push("aditya");
        stack.push("Aman");
        stack.push("Akshay");
        stack.push(100);

        System.out.println(stack); // it maintain the hetrogenious data and insertion order is also preserved.

        System.out.println(stack.pop());//lIFO (last IN First OUt ) concept will work.Only last element will come out. this method is used to remove the data.
        System.out.println(stack.pop());
        System.out.println(stack.search("aditya"));
        System.out.println(stack.peek());

}}

