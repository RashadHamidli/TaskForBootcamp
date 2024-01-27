package com.company;


import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Controller controller = new Controller();
//        controller.addTaskAndSendEmail();
//        controller.addTaskAndSendEmailExecutors();
        controller.addTaskAndSendEmailEx();
    }
}



