import edu.cu.ooad.animals.Animal;
import edu.cu.ooad.animals.animalspecies.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        List<String> animalNames = new ArrayList<>(Arrays.asList(new String[]{"Chloe", "Charlie", "Dexter", "Dan", "Leo",
                "Lucy", "Harry", "Howard", "Edward", "Eddy", "Rad", "Ruby", "Will", "Wade"}));
        List<String> animalSpecies = new ArrayList<>(Arrays.asList(new String[]{"Cat", "Cat", "Dog", "Dog", "Lion",
                "Lion", "Hippo", "Hippo", "Elephant", "Elephant", "Rhino", "Rhino", "Wolf", "Wolf"}));

        Zookeeper zookeeper = new Zookeeper("John");
        Zoo zoo = new Zoo();
        zoo.putAnimals(animalNames, animalSpecies);
//        zoo.setAnimals(animalList);
        zoo.setZookeeper(zookeeper);
        zoo.start();
    }


}
