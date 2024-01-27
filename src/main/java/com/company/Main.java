package com.company;


import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        LOGGER.info("Emeliyyat başladı.");
        Controller controller = new Controller();
//        controller.addTaskAndSendEmail();
        controller.addTaskAndSendEmailExecutors();
//        controller.addTaskAndSendEmailEx();
//        controller.addTaskAndSendEmailSimple();
        LOGGER.info("Emeliyyat bitdi.");
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        LOGGER.info("Emeliyyatın çəkdiyi müddət: " + duration + " millisaniyə");
    }
}



