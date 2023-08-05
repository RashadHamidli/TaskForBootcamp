package com.company.lesson19.task2;

import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
//        ///---> Değişken Tanımlaması <---\\\
//        String ayrac = new String(new char[15]).replace("\0", "-");
//        ///---> HashMap Non-Generic Tanımlaması <---\\\
//        HashMap hMap = new HashMap();
//        ///---> HashMap Metotlarını Kullanabilmek İçin Veri Girişi Yapalım <---\\\
//        hMap.put(183006029,"Ali İhsan");// HashMap üzerinde veri eşlemek için 'put' metodunu kullanırız.
//        hMap.put(183006042,"Emre");
//        hMap.put(183006055,"Mert");
//        hMap.put(183006058,"Ömer Faruk");
//        ///---> HashMap Metotlarını Kullanalım <---\\\
//        System.out.println(ayrac+"\n< Java HashMap Metotları >\n"+ayrac);
//        System.out.println("-> Eşlesen Veriler (entrySet): "+ hMap.entrySet()+"\n"+ayrac);
//        System.out.println("-> HashMap İçerisindeki Değerlerin Sayısı (size): "+ hMap.size());
//        System.out.println("-> HashMap İçerisinde get(183006055) Kullanımı: " + hMap.get(183006055));
//        System.out.println("-> HashMap Üzerinde remove(183006055) Kullanımı:"+hMap.remove(183006055));
//        System.out.println("-> HashMap Üzerinde containsValue(\"Mert\") Kullanımı: " + hMap.containsValue("Mert"));
//        System.out.println("-> Anahtar Verileri (keySet): " + hMap.keySet());
//        System.out.println("-> HashMap İçerisindeki Değerler (values): " + hMap.values());
//        System.out.println("-> HashCode Değerimiz (hashCode): "+ hMap.hashCode()+"\n"+ayrac);
//
//        System.out.println(hMap.keySet());
//        System.out.println(hMap.entrySet());

        String ayrac = new String(new char[15]).replace("\0","-");
        ///---> Hashtable Tanımlaması <---\\\
        Hashtable table = new Hashtable();
        ///---> Hashtable Metotlarını Kullanmak İçin Bazı Değerler Oluşturalım <---\\\
        table.put(1836025,"Emre");
        table.put(2346021,"Ömer Faruk");
        table.put(6524786,"Ali İhsan");
        table.put(5584290,"Mert");
        ///---> Hashtable Metotlarının Kullanışı <---\\\
        System.out.println(ayrac+"\n< Java Hashtable Metotları >\n"+ayrac);
        System.out.println("-> entrySet() Metot Kullanımı: " + table.entrySet());
        System.out.println("-> remove(5584290) Metot Kullanımı: " + table.remove(5584290));
        System.out.println("-> Get(2346021) Metot Kullanımı: " + table.get(2346021));
        System.out.println("-> \"Ali İhsan\".Equals(\"Ali Kefal\") Metot Kullanımı: " + "Ali İhsan".equals("Ali Kefal"));
        System.out.println("-> containsKey(1836025) Metot Kullanımı: "+ table.containsKey(1836025));
        System.out.println("-> keys() Metot Kullanımı: "+ table.keys());
        System.out.println("-> hashCode() Metot Kullanımı: " + table.hashCode());
        System.out.println("-> elements() Metot Kullanımı: " + table.elements()+"\n"+ayrac);

    }
}
