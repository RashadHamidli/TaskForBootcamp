package com.company.lesson16.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListManager<Integer> studenNo = new ListManager<>();
        studenNo.addList(1);
        studenNo.addList(2);
        studenNo.addList(3);
        studenNo.addList(4);
        ListManager<String> studentName=new ListManager<>();
        studentName.addList("Rashad");
        studentName.addList("Hamid");
        studentName.addList("Farhad");
        studentName.addList("Mamed");
        List<Integer> schoolNo=studenNo.getList();
        List<String> studentInfo=studentName.getList();
        for (int i = 0; i <schoolNo.size(); i++) {
            System.out.println("----------------\n< "+(i+1)+". Öğrenci Bilgisi >\n----------------\n-> Öğrenci Numarası: "+schoolNo.get(i)+"\n-> Öğrenci İsmi: "+studentInfo.get(i));
        }
        System.out.println("----------------");
    }
}
