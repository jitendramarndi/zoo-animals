package org.cu.ooad.animals.animalspecies;

import org.cu.ooad.animals.animaltypes.Feline;

public class Lion extends Feline {
    public Lion(String name) {
        super(name, "Cat");
    }

    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: Cat");
        System.out.println(name+" roars");
    }
}
