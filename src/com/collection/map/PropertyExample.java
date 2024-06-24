package com.collection.map;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyExample {
    public static void main(String[] args) throws IOException {
        FileReader file  = new FileReader("C:\\Users\\admin\\Desktop\\demo.properties");
        Properties properties=new Properties();
        properties.load(file);
        System.out.println(properties.getProperty("Name"));
        System.out.println(properties.getProperty("Companyname"));
    }
}
