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


}


