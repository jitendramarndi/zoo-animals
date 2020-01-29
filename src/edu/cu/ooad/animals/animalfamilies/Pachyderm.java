package edu.cu.ooad.animals.animalfamilies;

import edu.cu.ooad.animals.Animal;

public abstract class Pachyderm extends Animal {

    // Parameterized constructor
    public Pachyderm(String name, String type) {
        super(name, type);
    }

    // Implementing the abstract method of parent class roam().
    @Override
    public void roam() {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println(name+" roams");
    }
}
