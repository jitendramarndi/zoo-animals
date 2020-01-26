package org.cu.ooad.animals.animaltypes;


import org.cu.ooad.animals.Animal;

public class Feline extends Animal {
    public Feline(String name) {
        super(name, "Feline");
    }

    public void roam() {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println(name+" roams");
    }
}
