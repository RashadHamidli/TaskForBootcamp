package com.ser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeObj {
    public static void main(String[] args) {
        User user = null;
        try (FileInputStream fileInputStream = new FileInputStream("user.xml");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            user = (User) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        System.out.println(user.toString());
    }
}
