package org.cu.ooad.animals;

public class Animal {
    protected String name;
    protected String type;
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
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
