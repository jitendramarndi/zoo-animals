package org.cu.ooad.animals.animalspecies;

import org.cu.ooad.animals.animaltypes.Pachyderm;

public class Rhino extends Pachyderm {
    public Rhino(String name) {
        super(name);
    }

    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: " + type);
        System.out.println(name+" says meow");
    }
}
