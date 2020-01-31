package edu.cu.ooad.animals.animalspecies;

import edu.cu.ooad.animals.animalfamilies.Pachyderm;

public class Rhino extends Pachyderm {

    // Parameterized constructor for instantiating the object of this class.
    // Notice that we are not providing default constructor here so that it is mandatory to pass the name when instantiating Rhino object.
    public Rhino(String name) {
        super(name, "Rhino");
    }

    // Implementing the abstract method of parent class makeNoise().
    @Override
    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: " + type);
        System.out.println(name+" growls");
        System.out.println();
    }
}
