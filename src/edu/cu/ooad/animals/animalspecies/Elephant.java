package edu.cu.ooad.animals.animalspecies;

import edu.cu.ooad.animals.animalfamilies.Pachyderm;

public class Elephant extends Pachyderm {

    // Parameterized constructor for instantiating the object of this class.
    // Notice that we are not providing default constructor here so that it is mandatory to pass the name when instantiating Elephant object.
    public Elephant(String name) {
        super(name, "Elephant");
    }

    // Overriding makeNoise() implementation of the parent class.
    @Override
    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: " + type);
        System.out.println(name+" says rumbles");
    }
}
