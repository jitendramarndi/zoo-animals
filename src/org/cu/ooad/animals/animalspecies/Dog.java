package org.cu.ooad.animals.animalspecies;

import org.cu.ooad.animals.animaltypes.Canine;

public class Dog extends Canine {
    public Dog(String name) {
        super(name);
    }

    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: " + type);
        System.out.println(name+" barks");
    }
}
