package edu.cu.ooad.animals.animalspecies;

import edu.cu.ooad.animals.animalfamilies.Pachyderm;

public class Hippo extends Pachyderm {

    // Parameterized constructor for instantiating the object of this class.
    // Notice that we are not providing default constructor here so that it is mandatory to pass the name when instantiating Hippo object.
    public Hippo(String name) {
        super(name, "Hippo");
    }

    // Implementing the abstract method of parent class makeNoise().
    @Override
    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: " + type);
        System.out.println(name+" growls");
    }
}
