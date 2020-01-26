import org.cu.ooad.animals.Animal;

import java.util.List;

public class Zoo {

    private List<Animal> animals;
    private Zookeeper zookeeper;

    public Zoo() {

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

    public void start() {
        zookeeper.executeResponsibilities(animals);
    }


}
