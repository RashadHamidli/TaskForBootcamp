package com.app.familygpt;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
    }



    public void addChild(Human child) {
        this.children.add(child);
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < children.size()) {
            Human child = children.remove(index);
            if (child != null) {
                child.setFamily(null);
                return true;
            }
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Family:\n");
        sb.append("Mother: ").append(mother.toString()).append("\n");
        sb.append("Father: ").append(father.toString()).append("\n");
        sb.append("Children:\n");
        for (Human child : children) {
            sb.append(child.toString()).append("\n");
        }
        if (pet != null) {
            sb.append("Pet: ").append(pet.toString()).append("\n");
        }
        return sb.toString();
    }
}

