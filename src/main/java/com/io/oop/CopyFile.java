package com.io.oop;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {


        byte[] arr = {1, 5, 91, 6, 47, 8, 26, 3, 4, 66, 5, 9, 87, 4, 2, 6, 7, 13, 6, 4, 45, 23, 1, 8, 45, 81, 5, 8, 14};


        File file = new File("a.txt");
        System.out.println("file.mkdir() - " + file.mkdir());
        System.out.println("file.mkdirs() - " + file.mkdirs());


        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt")) {
            for (byte b : arr) {
                fileOutputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("test.txt")) {
            int size = fileInputStream.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) fileInputStream.read() + "  ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


//        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in)) {
//            System.out.println("Enter characters, 'q' to quit.");
//            char c;
//            do {
//                c = (char) inputStreamReader.read();
//            } while (c != 'q');
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

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
