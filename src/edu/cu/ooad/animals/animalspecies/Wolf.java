package edu.cu.ooad.animals.animalspecies;

import edu.cu.ooad.animals.animalfamilies.Canine;

public class Wolf extends Canine {

    // Parameterized constructor for instantiating the object of this class.
    // Notice that we are not providing default constructor here so that it is mandatory to pass the name when instantiating Wolf object.
    public Wolf(String name) {
        super(name, "Wolf");
    }

    // Implementing the abstract method of parent class makeNoise().
    @Override
    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: " + type);
        System.out.println(name+" howls");
        System.out.println();
    }
}
