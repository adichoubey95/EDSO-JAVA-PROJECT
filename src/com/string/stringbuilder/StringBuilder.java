package com.string.stringbuilder;

public class StringBuilder {
    public static void main(String[] args) {

        String name= "aditya";
        StringBuffer sb= new StringBuffer(name);
       System.out.println(sb.append(" choubey"));
         System.out.println(sb.insert(2,10));
         System.out.println(sb.insert(2,"adi"));
         System.out.println(sb.replace(2,4,"hello every one"));
          System.out.println(sb.delete(1,2));
        System.out.println(sb.reverse());
    }
}
