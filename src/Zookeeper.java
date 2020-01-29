import edu.cu.ooad.animals.Animal;

import java.util.List;

public class Zookeeper {
    private String name;
    public Zookeeper(String name) {
        this.name = name;
    }

    public void executeResponsibilities(List<Animal> animals) {
        wakeAnimals(animals);
        rollCall(animals);
        feedAnimals(animals);
        exerciseAnimals(animals);
        shutdownZoo(animals);
    }

    public void wakeAnimals(List<Animal> animals) {
        System.out.println("Waking up animals");
        System.out.println("---------------------------");
        for(Animal animal: animals) {
            animal.wakeup();
        }
        System.out.println();
        System.out.println();
    }

    public void rollCall(List<Animal> animals) {
        System.out.println("Roll calling animals");
        System.out.println("---------------------------");
        for(Animal animal: animals) {
            animal.makeNoise();
        }
        System.out.println();
        System.out.println();
    }

    public void feedAnimals(List<Animal> animals) {
        System.out.println("Feeding the animals");
        System.out.println("---------------------------");
        for(Animal animal: animals) {
            animal.eat();
        }
        System.out.println();
        System.out.println();
    }

    public void exerciseAnimals(List<Animal> animals) {
        System.out.println("Exercising the animals");
        System.out.println("---------------------------");
        for(Animal animal: animals) {
            animal.roam();
        }
        System.out.println();
        System.out.println();
    }

    public void shutdownZoo(List<Animal> animals) {
        System.out.println("Shutting down the zoo");
        System.out.println("---------------------------");
        for(Animal animal: animals) {
            animal.sleep();
        }
        System.out.println();
        System.out.println();
    }
}
