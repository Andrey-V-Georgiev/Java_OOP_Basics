package pawInc2.centers;

import pawInc2.animals.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static pawInc2.AnimalCenterManager.adoptionCenters;
import static pawInc2.AnimalCenterManager.cleansedAnimals;

public class CleansingCenter extends Center {

    private HashMap<String, List<Animal>> dirtyAnimals = new HashMap<>();

    public CleansingCenter(String name) {
        super(name);
    }

    public void receiveAnimalsFromAdoptionCenter(String adoptionCenterName, List<Animal> animals) {
        this.dirtyAnimals.putIfAbsent(adoptionCenterName, new ArrayList<>());
        this.dirtyAnimals.get(adoptionCenterName).addAll(animals);
    }

    public HashMap<String, List<Animal>> getDirtyAnimals() {
        return dirtyAnimals;
    }

    public void cleanse() {
        for (Map.Entry<String, List<Animal>> entry : this.dirtyAnimals.entrySet()) {
            String adoptionCenterName = entry.getKey();
            List<Animal> animalsToAdoptionCenter = new ArrayList<>(entry.getValue());
            List<String> cleansedAnimalsNames = entry.getValue().stream().map(Animal::getName).collect(Collectors.toList());
            cleansedAnimals.addAll(cleansedAnimalsNames);
            adoptionCenters.get(adoptionCenterName).receiveFromCleansingCenter(animalsToAdoptionCenter);
        }
        this.dirtyAnimals.clear();
    }

    public int waitingAnimalsCount(){
        return this.dirtyAnimals.values().stream().mapToInt(l->l.size()).sum();
    }
}
