package org.cu.ooad.animals.animalspecies;

import org.cu.ooad.animals.animaltypes.Pachyderm;

public class Elephant extends Pachyderm {
    public Elephant(String name) {
        super(name, "Cat");
    }

    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: Cat");
        System.out.println(name+" says rumbles");
    }
}
