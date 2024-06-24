package com.fileclass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        File file= new File("F:\\Adi desktop\\730 batch.txt");
        FileWriter f= new FileWriter(file);
        f.write("This is a new file.");
        f.close();

    }
}
