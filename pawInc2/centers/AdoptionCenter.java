package pawInc2.centers;

import pawInc2.animals.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static pawInc2.AnimalCenterManager.adoptedAnimals;
import static pawInc2.AnimalCenterManager.castrationCenters;
import static pawInc2.AnimalCenterManager.cleansedCenters;

public class AdoptionCenter extends Center{
    private List<Animal> dirtyAnimals;
    private List<Animal> cleanAnimals;


    public AdoptionCenter(String name) {
        super(name);
        this.cleanAnimals = new ArrayList<>();
        this.dirtyAnimals = new ArrayList<>();
    }

    public List<Animal> getDirtyAnimals() {
        return this.dirtyAnimals;
    }

    public List<Animal> getCleanAnimals() {
        return this.cleanAnimals;
    }

    public void registrateAnimal(Animal animal){
        this.dirtyAnimals.add(animal);
    }

    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName){
        List<Animal> animalsToCleansingCenter = new ArrayList<>(this.dirtyAnimals);
        cleansedCenters.get(cleansingCenterName).receiveAnimalsFromAdoptionCenter(adoptionCenterName, animalsToCleansingCenter);
        this.dirtyAnimals.clear();
    }

    public void receiveFromCleansingCenter(List<Animal> animals){
        this.cleanAnimals.addAll(animals);
    }

    public void adopt(){
        List<String> adoptedList = this.cleanAnimals.stream().map(Animal::getName).collect(Collectors.toList());
        adoptedAnimals.addAll(adoptedList);
        this.cleanAnimals.clear();
    }

    public int getCleansedAnimalsCount(){
        return this.cleanAnimals.size();
    }

    public void sendForCastration(String  adoptionCenterName, String castrationCenterName){
        List<Animal> animalsForCastration = new ArrayList<>(this.dirtyAnimals);
        this.dirtyAnimals.clear();
        castrationCenters.get(castrationCenterName).getAnimalsFromAdoptingCenters(adoptionCenterName, animalsForCastration);
    }

    public void receiveFromCastrationCenter(List<Animal> castratedAnimals){
        this.dirtyAnimals.addAll(castratedAnimals);
    }
}
