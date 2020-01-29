package edu.cu.ooad.animals.animalspecies;

import edu.cu.ooad.animals.animalfamilies.Feline;

import java.util.Random;

public class Cat extends Feline {

    private final int NO_OF_ALTERNATE_REPSONSES = 4;

    // Parameterized constructor for instantiating 'Cat' class.
    // Notice that we are not providing default constructor here so that it is mandatory to pass the name when instantiating Cat object.
    public Cat(String name) {
        super(name, "Cat");
    }


    // Implementing the abstract method of parent class makeNoise().
    @Override
    public void makeNoise() {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println(name+" says meow");
    }


    // The below method uses random number generation to select alternative responses when Cat is asked to sleep.
    // So overriding the parent class implementation of sleep().
    @Override
    public void sleep() {

        // Generate random number using an instance of class Random.
        Random rand = new Random();
        int randInt = rand.nextInt(NO_OF_ALTERNATE_REPSONSES);

        // Based on the random number generated, perform an alternate activity
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
        }
    }
}
