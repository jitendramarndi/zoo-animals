package org.cu.ooad.animals.animalspecies;

import org.cu.ooad.animals.animaltypes.Feline;

public class Tiger extends Feline {
    public Tiger(String name) {
        super(name);
    }

    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: " + type);
        System.out.println(name+" roars");
    }
}
