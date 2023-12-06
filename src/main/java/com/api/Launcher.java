package com.api;

public class Launcher {
    public static void main(String[] args) {
        var userRespons = new UserController().print(new UserRequest("john@gmail.com", "123456"));
        System.out.println(userRespons);
    }
}
