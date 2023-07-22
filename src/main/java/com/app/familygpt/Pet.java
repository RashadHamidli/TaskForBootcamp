package com.app.familygpt;

public class Pet {
    private String name;
    private String animalType;

    public Pet(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", animalType='" + animalType + '\'' +
                '}';
    }
}

