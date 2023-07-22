package com.app.familygpt;

import com.app.happyFamily.Father;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private Mother mother;
    private Father father;
    private List<Child> children;
    private Family family;
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

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Family:\n");
        sb.append("Mother: ").append(mother.toString()).append("\n");
        sb.append("Father: ").append(father.toString()).append("\n");
        sb.append("Children:\n");
        for (Child child : children) {
            sb.append(child.toString()).append("\n");
        }
        if (pet != null) {
            sb.append("Pet: ").append(pet.toString()).append("\n");
        }
        return sb.toString();
    }
}

