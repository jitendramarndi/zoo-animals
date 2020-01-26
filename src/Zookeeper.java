import org.cu.ooad.animals.Animal;

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
        for(Animal animal: animals) {
            animal.wakeup();
        }
    }

    public void rollCall(List<Animal> animals) {
        System.out.println("Roll calling animals");
        for(Animal animal: animals) {
            animal.makeNoise();
        }
    }

    public void feedAnimals(List<Animal> animals) {
        System.out.println("Feeding the animals");
        for(Animal animal: animals) {
            animal.eat();
        }
    }

    public void exerciseAnimals(List<Animal> animals) {
        System.out.println("Exercising the animals");
        for(Animal animal: animals) {
            animal.roam();
        }
    }

    public void shutdownZoo(List<Animal> animals) {
        System.out.println("Shutting down the zoo");
        for(Animal animal: animals) {
            animal.sleep();
        }
    }
}
