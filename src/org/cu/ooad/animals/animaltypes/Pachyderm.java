package org.cu.ooad.animals.animaltypes;

import org.cu.ooad.animals.Animal;

public class Pachyderm extends Animal {
    public Pachyderm(String name) {
        super(name, "Pachyderm");
    }

    public void roam() {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println(name+" roams");
    }
}
