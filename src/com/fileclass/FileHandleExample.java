package com.fileclass;

import java.io.File;
import java.io.IOException;


public class FileHandleExample {
    public static void main(String[] args) throws IOException {
        File file= new File("F:\\Adi desktop\\730 batch.txt");
        file.createNewFile();
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isAbsolute());
        System.out.println(file.isDirectory());  //"F:\\Adi desktop
        System.out.println(file.isFile());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.toURI());

    }
}
