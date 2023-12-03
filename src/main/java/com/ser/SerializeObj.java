package com.ser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObj {
    public static void main(String[] args) {
        User user=new User(1, "Rashad","Hamidli", "mr_rashad@email.com", "123456");
        try (FileOutputStream fileOutputStream = new FileOutputStream("user.xml");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
