import edu.cu.ooad.animals.Animal;
import edu.cu.ooad.animals.animalspecies.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // The main method uses a member of zoo class to create Animal objects with the below given names and types.
    // It then creates the Zookeeper object and passes it to the Zoo object.
    public static void main(String[] args) {
        List<String> animalNames = Arrays.asList(new String[]{"Chloe", "Charlie", "Dexter", "Dan", "Leo",
                "Lucy", "Harry", "Howard", "Edward", "Eddy", "Rad", "Ruby", "Will", "Wade"});
        List<String> animalSpecies = Arrays.asList(new String[]{"Cat", "Cat", "Dog", "Dog", "Lion",
                "Lion", "Hippo", "Hippo", "Elephant", "Elephant", "Rhino", "Rhino", "Wolf", "Wolf"});

        Zookeeper zookeeper = new Zookeeper("John");
        Zoo zoo = new Zoo();
        zoo.putAnimals(animalNames, animalSpecies);
        zoo.setZookeeper(zookeeper);
        zoo.start();
    }


}
