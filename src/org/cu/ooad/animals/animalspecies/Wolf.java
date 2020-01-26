package org.cu.ooad.animals.animalspecies;

import org.cu.ooad.animals.animaltypes.Canine;

public class Wolf extends Canine {
    public Wolf(String name) {
        super(name);
    }

    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: " + type);
        System.out.println(name+" howls");
    }
}
