package org.example;

public class Animal {

    private AnimalType animalType;
    private String name;
    private double weight;

    public Animal(AnimalType animalType, String name, double weight) {
        this.animalType = animalType;
        this.name = name;
        this.weight = weight;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
