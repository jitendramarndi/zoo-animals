package edu.cu.ooad.animals.animalspecies;

import edu.cu.ooad.animals.animalfamilies.Canine;

public class Dog extends Canine {

    // Parameterized constructor for instantiating 'Dog' class.
    // Notice that we are not providing default constructor here so that it is mandatory to pass the name when instantiating Dog object.
    public Dog(String name) {
        super(name, "Dog");
    }

    // Implementing the abstract method of parent class makeNoise().
    @Override
    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: " + type);
        System.out.println(name+" barks");
        System.out.println();
    }
}
