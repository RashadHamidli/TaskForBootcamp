package com.company.controller;

import java.util.ArrayList;
import java.util.Random;

public class CreateCode {
    Random random = new Random();
    ArrayList lisenceKey = new ArrayList();
    String lisenceCode;
    int randomValue;
    public String newCode(){
        lisenceCode="";
        for(int i=0;i<16;i++){
            if(i==0 || i==4 || i==8 || i==12){
                randomValue = random.nextInt(26)+65;
                if(lisenceKey.contains((char)randomValue) == true)
                    randomValue = random.nextInt(20)+71;
                if(lisenceKey.contains((char)randomValue)==true)
                    randomValue = random.nextInt(25)+66;
                lisenceKey.add((char)randomValue);
            }
            else{
                randomValue = random.nextInt(25);
                if(randomValue < 10){
                    if(lisenceKey.contains(randomValue) ==  true)
                        randomValue = random.nextInt(10);
                    lisenceKey.add(randomValue);
                }
                else if(randomValue>10 && randomValue<35){
                    randomValue = random.nextInt(15)+76;
                    if(lisenceKey.contains((char)randomValue)==true)
                        randomValue = random.nextInt(26)+65;
                    lisenceKey.add((char)randomValue);
                }
                else {
                    randomValue = random.nextInt(20)+71;
                    if(lisenceKey.contains((char)randomValue)==true){
                        randomValue = random.nextInt(10);
                        lisenceKey.add(randomValue);
                    }
                    else
                        lisenceKey.add((char)randomValue);
                }
            }
        }
        int sp=0;
        for(var a : lisenceKey){
            lisenceCode += a;
            if(sp==3 || sp==7 || sp==11)
                lisenceCode += " - ";
            sp++;
        }
        lisenceKey.clear();
        return lisenceCode;
    }
}
