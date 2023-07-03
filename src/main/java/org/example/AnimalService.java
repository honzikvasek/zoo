package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalService {
    private List<Animal> animals;
    private Map<Animal, List<Employee>> caredBy;

    public AnimalService() {
        this.animals = new ArrayList<>();
        this.caredBy = new HashMap<>();
    }

    public void addAnimal(Animal animal, List<Employee> employees) {
        animals.add(animal);
        caredBy.put(animal, employees);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
        caredBy.remove(animal);
    }
}
