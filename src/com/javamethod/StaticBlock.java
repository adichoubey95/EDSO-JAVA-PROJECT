package com.javamethod;

import org.w3c.dom.ls.LSOutput;

public class StaticBlock {

    static{
        System.out.println("this is static block");
    }

    public static void main(String[] args) {
        System.out.println("this is main method");
    }

}
