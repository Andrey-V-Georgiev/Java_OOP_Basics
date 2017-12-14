package pawInc2.centers;

import pawInc2.animals.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static pawInc2.AnimalCenterManager.adoptionCenters;
import static pawInc2.AnimalCenterManager.castratedAnimals;

public class CastrationCenter extends Center {
    private HashMap<String, List<Animal>> animalsFromAdoptingCenters;

    public CastrationCenter(String name) {
        super(name);
        this.animalsFromAdoptingCenters = new HashMap<>();
    }

    public HashMap<String, List<Animal>> getAnimalsFromAdoptingCenters() {
        return animalsFromAdoptingCenters;
    }

    public void getAnimalsFromAdoptingCenters(String adoptedCenterName, List<Animal> animals) {
        this.animalsFromAdoptingCenters.putIfAbsent(adoptedCenterName, new ArrayList<>());
        this.animalsFromAdoptingCenters.get(adoptedCenterName).addAll(animals);
    }

    public void castrate(){
        for (Map.Entry<String, List<Animal>> entry : animalsFromAdoptingCenters.entrySet()) {
            String adoptionCenterName = entry.getKey();
            List<Animal> castratedAnimalsList = entry.getValue();
            List<String> castratedAnimalsNames = entry.getValue().stream().map(Animal::getName).collect(Collectors.toList());
            adoptionCenters.get(adoptionCenterName).receiveFromCastrationCenter(castratedAnimalsList);
            castratedAnimals.addAll(castratedAnimalsNames);
        }
        this.animalsFromAdoptingCenters.clear();
    }

}
