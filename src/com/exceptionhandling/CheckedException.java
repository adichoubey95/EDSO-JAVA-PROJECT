package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {

       try{
           FileReader fileReader=new FileReader(""); // checked exception
      }catch(FileNotFoundException f) {
          f.printStackTrace();
       }

    }
}
