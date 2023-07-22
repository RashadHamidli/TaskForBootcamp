package com.app.familygpt;


import java.util.ArrayList;
import java.util.List;

public class Family {
    private Mother mother;
    private Father father;
    private List<Child> children;
    private Pet pet;

    public Family(Mother mother, Father father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
    }

    public void addChild(Child child) {
        this.children.add(child);
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < children.size()) {
            Child child = children.remove(index);
        }
        return false;
    }

    public int countFamily() {
        return 2 + children.size();
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }
}

