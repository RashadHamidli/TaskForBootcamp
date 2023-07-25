package com.company.lesson16.task4;

import java.util.ArrayList;
import java.util.List;

import static com.company.lesson16.task4.GenericsTester.*;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalList= new ArrayList<Animal>();
        List<RedCat> redCatList= new ArrayList<RedCat>();

        //add list of super class Animal of Cat class
        addCat(animalList);
        //add list of Cat class
        addCat(redCatList);
        addCat(redCatList);

        //print all animals
        printAll(animalList);
        printAll(redCatList);

        Cat cat = redCatList.get(0);
        //delete cat
        deleteCat(redCatList, cat);
        printAll(redCatList);
    }
}
