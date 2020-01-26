package org.cu.ooad.animals.animalspecies;

import org.cu.ooad.animals.animaltypes.Feline;

import java.util.Random;

public class Cat extends Feline {
    public Cat(String name) {
        super(name);
    }

    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: Cat");
        System.out.println(name+" says meow");
    }

    public void sleep() {
        Random rand = new Random();
        int randInt = rand.nextInt(5);
        switch (randInt) {
            case 0:
                wakeup();
                break;
            case 1:
                makeNoise();
                break;
            case 2:
                eat();
                break;
            case 3:
                roam();
                break;
            case 4:
                sleep();
                break;
        }
    }
}
