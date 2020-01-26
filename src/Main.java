import org.cu.ooad.animals.Animal;
import org.cu.ooad.animals.animalspecies.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        List<String> animalNames = new ArrayList<>(Arrays.asList(new String[]{"Chloe", "Charlie", "Dexter", "Dan", "Luke",
                "L2", "H1", "H2", "E1", "E2", "R1", "R2", "W1", "W2"}));
        List<String> animalTypes = new ArrayList<>(Arrays.asList(new String[]{"Cat", "Cat", "Dog", "Dog", "Lion",
                "Lion", "Hippo", "Hippo", "Elephant", "Elephant", "Rhino", "Rhino", "Wolf", "Wolf"}));

        for(int i=0; i<animalNames.size(); i++) {
            String name = animalNames.get(i);
            switch (animalTypes.get(i)) {
                case "Cat":
                    animalList.add(new Cat(name));
                    break;
                case "Dog":
                    animalList.add(new Dog(name));
                    break;
                case "Elephant":
                    animalList.add(new Elephant(name));
                    break;
                case "Hippo":
                    animalList.add(new Hippo(name));
                    break;
                case "Lion":
                    animalList.add(new Lion(name));
                    break;
                case "Rhino":
                    animalList.add(new Rhino(name));
                    break;
                case "Tiger":
                    animalList.add(new Tiger(name));
                    break;
            }
        }
        Zookeeper zookeeper = new Zookeeper("John");
        Zoo zoo = new Zoo();
        zoo.setAnimals(animalList);
        zoo.setZookeeper(zookeeper);
        zoo.start();
//        FileWriter fileWriter = new FileWriter("c:/temp/samplefile2.txt");
//        fileWriter.write(fileContent);
//        fileWriter.close();

    }
}
