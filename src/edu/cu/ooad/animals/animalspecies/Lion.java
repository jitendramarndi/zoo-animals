package edu.cu.ooad.animals.animalspecies;

import edu.cu.ooad.animals.animalfamilies.Feline;

public class Lion extends Feline {

    // Parameterized constructor for instantiating the object of this class.
    // Notice that we are not providing default constructor here so that it is mandatory to pass the name when instantiating Lion object.
    public Lion(String name) {
        super(name, "Lion");
    }

    // Implementing the abstract method of parent class makeNoise().
    @Override
    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: " + type);
        System.out.println(name+" roars");
        System.out.println();
    }
}
