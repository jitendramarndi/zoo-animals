import edu.cu.ooad.animals.Animal;
import edu.cu.ooad.animals.animalspecies.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {

    // Zoo will have animals and a zookeeper. So Zoo class has objects of animals and zookeeper.
    private List<Animal> animals;
    private Zookeeper zookeeper;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }

    // Once the zoo is started, zookeeper will start doing his work as explained in the problem statement.
    public void start() {
        zookeeper.executeResponsibilities(animals);
    }

    // This is used to add a list of animals to the zoo.
    public void putAnimals(List<String> animalNames, List<String> animalSpecies) {

        for(int i=0; i<animalNames.size(); i++) {
            String name = animalNames.get(i);
            switch (animalSpecies.get(i)) {
                case "Cat":
                    animals.add(new Cat(name));
                    break;
                case "Dog":
                    animals.add(new Dog(name));
                    break;
                case "Elephant":
                    animals.add(new Elephant(name));
                    break;
                case "Hippo":
                    animals.add(new Hippo(name));
                    break;
                case "Lion":
                    animals.add(new Lion(name));
                    break;
                case "Rhino":
                    animals.add(new Rhino(name));
                    break;
                case "Tiger":
                    animals.add(new Tiger(name));
                    break;
                case "Wolf":
                    animals.add(new Wolf(name));
                    break;
            }
        }
    }

}
