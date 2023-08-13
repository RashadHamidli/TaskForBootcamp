package com.company.lesson19.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ///---> Çalışan Eklemesi Gerçekleştirelim <---\\\
        WorkerDetails metehan = new WorkerDetails(666,"Metehan","Durmuş","Mühendis",6000);
        WorkerDetails kerem = new WorkerDetails(473,"Kerem","Seven","Reklamcı",5000);
        WorkerDetails oktay = new WorkerDetails(984,"Oktay","Güden","Grafiker",4800);
        WorkerDetails sait = new WorkerDetails(482,"Sait","Öztaş","Mühendis",5800);

        ///---> $HashSet Oluşturup Çalışanları Ekleyelim <---\\\
        HashSet<WorkerDetails> set = new HashSet<>();
        set.add(metehan);
        set.add(kerem);
        set.add(oktay);
        set.add(sait);

//        set.forEach(System.out::println);

        Iterator itr = set.iterator(); // $HashSet yapımızın içerisinde dolaşmak için oluşturduk.
        System.out.println("[Çalışan No]\t[Adı]\t\t\t[Soyadı]\t\t[Mesleği]\t\t\t[Maaşı]\t\t\t\t[İzin Günü]");
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}
