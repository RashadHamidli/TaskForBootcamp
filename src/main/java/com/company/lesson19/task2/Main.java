package com.company.lesson19.task2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ///---> Değişken Tanımlaması <---\\\
        String ayrac = new String(new char[15]).replace("\0", "-");
        ///---> HashMap Non-Generic Tanımlaması <---\\\
        HashMap hMap = new HashMap();
        ///---> HashMap Metotlarını Kullanabilmek İçin Veri Girişi Yapalım <---\\\
        hMap.put(183006029,"Ali İhsan");// HashMap üzerinde veri eşlemek için 'put' metodunu kullanırız.
        hMap.put(183006042,"Emre");
        hMap.put(183006055,"Mert");
        hMap.put(183006058,"Ömer Faruk");
        ///---> HashMap Metotlarını Kullanalım <---\\\
        System.out.println(ayrac+"\n< Java HashMap Metotları >\n"+ayrac);
        System.out.println("-> Eşlesen Veriler (entrySet): "+ hMap.entrySet()+"\n"+ayrac);
        System.out.println("-> HashMap İçerisindeki Değerlerin Sayısı (size): "+ hMap.size());
        System.out.println("-> HashMap İçerisinde get(183006055) Kullanımı: " + hMap.get(183006055));
        System.out.println("-> HashMap Üzerinde remove(183006055) Kullanımı:"+hMap.remove(183006055));
        System.out.println("-> HashMap Üzerinde containsValue(\"Mert\") Kullanımı: " + hMap.containsValue("Mert"));
        System.out.println("-> Anahtar Verileri (keySet): " + hMap.keySet());
        System.out.println("-> HashMap İçerisindeki Değerler (values): " + hMap.values());
        System.out.println("-> HashCode Değerimiz (hashCode): "+ hMap.hashCode()+"\n"+ayrac);

    }
}
