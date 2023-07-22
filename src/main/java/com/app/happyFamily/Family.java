package com.app.happyFamily;

import java.util.List;

public class Family {
    private Father father;
    private Mother mother;
    private List<Child> child;
    private List<Pet> pet;

    public String addChild(Child child) {
        child.setName(child.getName());
        child.setName(child.getName());
        child.setYear(child.getYear());
        child.setIq(child.getIq());
        return "add successfully";
    }

    public String deleteChild() {
        return "delete successfully";
    }

//    public int countFamily() {
//        int count = 2 + child.size();
//        return count;
//    }

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", child=" + child +
                ", pet=" + pet +
                '}';
    }
}
