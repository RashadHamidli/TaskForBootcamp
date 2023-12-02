package com.io.oop;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in)) {
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) inputStreamReader.read();
            } while (c != 'q');
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in)) {
//            System.out.println("Enter characters, 'q' to quit.");
//            char c;
//            do {
//                c = (char) inputStreamReader.read();
//                System.out.print(c);
//            } while (c != 'q');
//        }


//        try (FileWriter fileWriter = new FileWriter("a.txt")) {
//            fileWriter.write("bu yeni filedir");
//            new File("b.txt").createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (FileInputStream fileInputStream = new FileInputStream("a.txt");
//             FileOutputStream fileOutputStream = new FileOutputStream("b.txt")) {
//            int i;
//            while ((i = fileInputStream.read()) != -1) {
//                fileOutputStream.write(i);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        try (FileReader fileReader = new FileReader("a.txt");
//             FileWriter fileWriter = new FileWriter("b.txt")) {
//            int i;
//            while ((i = fileReader.read()) != -1) {
//                fileWriter.write(i);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
