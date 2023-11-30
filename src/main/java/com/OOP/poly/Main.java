package com.OOP.poly;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
}

