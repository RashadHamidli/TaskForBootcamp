package com.company.lesson16.task4;

import java.util.ArrayList;
import java.util.List;

public class GenericsTester {

    //Upper bound wildcard
    //in category
    public static void deleteCat(List<? extends Cat> catList, Cat cat) {
        catList.remove(cat);
        System.out.println("Cat Removed");
    }

    //Lower bound wildcard
    //out category
    public static void addCat(List<? super RedCat> catList) {
        catList.add(new RedCat("Red Cat"));
        System.out.println("Cat Added");
    }

    //Unbounded wildcard
    //Using Object method toString()
    public static void printAll(List<?> list) {
        for (Object item : list)
            System.out.println(item + " ");
    }

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


