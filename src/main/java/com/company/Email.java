package com.company;

public class Email implements Runnable{
    private String email;
    private String content;

    public Email(String email, String content) {
        this.email = email;
        this.content = content;
    }

    @Override
    public void run() {
//        System.out.println("email gondermek 5 saniye sonra bas verecek\n "+Thread.currentThread().getName()+" ise basladi");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("email gonderildi\n"+Thread.currentThread().getName()+" isini bitirdi");
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
