package com.app.happyFamily;

import java.util.Arrays;

public class Family {
    public Human father;
    public Human mother;
    public Human[] child;
    public void allFamily(Father father, Mother mother, Child child){
        this.father=father;
        this.mother=mother;
        this.child= new Child[]{child};
    }

    public Child[] addChild(Child[] child) {
        this.child = child;
        return child;
    }
    public Father addFather(Father father){
        this.father=father;
        return father;
    }
    public Mother addMother(Mother mother){
        this.mother=mother;
        return mother;
    }

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", child=" + Arrays.toString(child) +
                '}';
    }
}
