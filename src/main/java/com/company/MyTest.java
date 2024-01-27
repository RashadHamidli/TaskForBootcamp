package com.company;

public class MyTest {
    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyTest().new MyRunnable();
//
//        Thread thread1 = new Thread(myRunnable);
//        thread1.start();
//
//        Thread thread2 = new Thread(myRunnable);
//        thread2.start();

        MyThread myThread = new MyTest().new MyThread();

        Thread thread3 = new Thread(myThread);
        thread3.start();

        Thread thread4 = new Thread(myThread);
        thread4.start();
    }

    class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("thread ise basladi");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread 3 saniyelik emeliyyatdan sonra isini bitirdi");
        }
    }

    class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("thread ise basladi");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread 3 saniyelik emeliyyatdan sonra isini bitirdi");
        }
    }


}




