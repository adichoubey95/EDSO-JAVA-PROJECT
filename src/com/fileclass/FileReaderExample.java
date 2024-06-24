package com.fileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        File file= new File("F:\\Adi desktop\\730 batch.txt");
        FileReader FR= new FileReader(file);

        int i;

        while((i=FR.read())!=-1){
            System.out.print((char)i);

        }
        FR.close();

    }
}
