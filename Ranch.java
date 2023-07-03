import java.util.ArrayList;
import java.util.List;

public class Ranch {
    private final List<Animal> ranchList;

    public Ranch() {
        this.ranchList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("They live on ranch: %s", ranchList);
    }

    public void addToRanch(Animal animal) {
        ranchList.add(animal);
    }

    public Animal getAnimal(String name) {
        for (Animal animal : ranchList) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }
}
