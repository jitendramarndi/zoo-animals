package org.cu.ooad.animals;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Animal {
    protected String name;
    protected String type;
    protected PrintStream fileOut;
    protected PrintStream fileErr;
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

    public void wakeup() {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println(name+" wakes up");
    }

    public void eat() {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println(name+" eats");
    }

    public void roam() {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println(name+" roams");
    }

    public void sleep() {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println(name+" sleeps");
    }

    public void makeNoise() {
    }
}
