package edu.cu.ooad.animals;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public abstract class Animal {

    // Making the below properties as protected because the child and grandchildren classes need to access
    // them.
    // 'name' and 'type' properties are needed while displaying the animal responses (specifically for the
    // response of makeNoise activity).
    // 'fileOut' is used to write the console output to the file.
    // 'fileErr' is used to write errors during the program execution to the file.
    protected String name;
    protected String type;
    protected PrintStream fileOut;
    protected PrintStream fileErr;

    // Parameterized constructor
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        try {
            this.fileOut  = new PrintStream("dayatthezoo.out");
            this.fileErr  = new PrintStream("dayatthezooerr.out");
            System.setOut(fileOut);
            System.setErr(fileErr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    // Below written activities are common to all animals in the zoo. So they have been
    // implemented in the grandparent class of this hierarchy of classes.
    public void wakeup() {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println(name+" wakes up");
        System.out.println();
    }

    public void eat() {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println(name+" eats");
        System.out.println();
    }

    public void sleep() {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println(name+" sleeps");
        System.out.println();
    }

    // Making the below members abstract because the child classes have to implement this method for their instantiation.
    // This is because making noise and roaming are specific to each animal type. So they are made abstract in Animal class
    public abstract void makeNoise();

    public abstract void roam();

}
