package pawInc2;


import pawInc2.animals.Cat;
import pawInc2.animals.Dog;
import pawInc2.centers.AdoptionCenter;
import pawInc2.centers.CastrationCenter;
import pawInc2.centers.CleansingCenter;

import java.util.*;

public class AnimalCenterManager {
    public static HashMap<String, AdoptionCenter> adoptionCenters = new HashMap<>();
    public static HashMap<String, CleansingCenter> cleansedCenters = new HashMap<>();
    public static HashMap<String, CastrationCenter> castrationCenters = new HashMap<>();
    public static Set<String> adoptedAnimals =   new TreeSet<>();
    public static Set<String> cleansedAnimals =  new TreeSet<>();
    public static Set<String> castratedAnimals = new TreeSet<>();

    public AnimalCenterManager(){
    }

    //////////////////////////////////////////////////////////////////////////////////////

    public void registerCleansingCenter(String name) {
        CleansingCenter newCleansingCenter = new CleansingCenter(name);
        cleansedCenters.putIfAbsent(name, newCleansingCenter);
    }

    public void registerAdoptionCenter(String name) {
        AdoptionCenter newAdoptionCenter = new AdoptionCenter(name);
        adoptionCenters.putIfAbsent(name, newAdoptionCenter);
    }

    public void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
          Dog newDog = new Dog(name,age,learnedCommands);
          adoptionCenters.get(adoptionCenterName).registrateAnimal(newDog);
    }

    public void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        Cat newCat = new Cat(name, age, intelligenceCoefficient);
        adoptionCenters.get(adoptionCenterName).registrateAnimal(newCat);
    }

    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        adoptionCenters.get(adoptionCenterName).sendForCleansing(adoptionCenterName, cleansingCenterName);
    }

    public void cleanse(String cleansingCenterName) {
        cleansedCenters.get(cleansingCenterName).cleanse();
    }

    public void adopt(String adoptionCenterName) {
        adoptionCenters.get(adoptionCenterName).adopt();
    }

    public void printStatistics() {
        System.out.println("Paw Incorporative Regular Statistics");

        System.out.printf("Adoption Centers: %d%n", adoptionCenters.size());

        System.out.printf("Cleansing Centers: %d%n", cleansedCenters.size());

        String allAdoptedAnimals = adoptedAnimals.size() > 0 ? String.join(", ", adoptedAnimals) : "None";
        System.out.printf("Adopted Animals: %s%n", allAdoptedAnimals);

        String allCleansedAnimals = cleansedAnimals.size() > 0 ?  String.join(", ", cleansedAnimals) : "None";
        System.out.printf("Cleansed Animals: %s%n", allCleansedAnimals);

        int amountOfAnimalsWaitingForAdoption = adoptionCenters.values().stream().mapToInt(AdoptionCenter::getCleansedAnimalsCount).sum();
        System.out.printf("Animals Awaiting Adoption: %d%n", amountOfAnimalsWaitingForAdoption);

        int amountOfAnimalsWaitingForCleansing = cleansedCenters.values().stream().mapToInt(CleansingCenter::waitingAnimalsCount).sum();
        System.out.printf("Animals Awaiting Cleansing: %d%n", amountOfAnimalsWaitingForCleansing);

    }

    public void registerCastrationCenter(String name) {
        CastrationCenter newCastrationCenter = new CastrationCenter(name);
        castrationCenters.putIfAbsent(name, newCastrationCenter);
    }

    public void sendForCastration(String adoptionCenterName, String castrationCenterName) {
       adoptionCenters.get(adoptionCenterName).sendForCastration(adoptionCenterName, castrationCenterName);
    }

    public void castrate(String castrationCenterName) {
        castrationCenters.get(castrationCenterName).castrate();
    }

    public void castrationStatistics() {
        System.out.println("Paw Inc. Regular Castration Statistics");
        System.out.printf("Castration Centers: %d%n", castrationCenters.size());

        String allCastratedAnimals = castratedAnimals.size() > 0 ? String.join(", ", castratedAnimals) : "None";
        System.out.printf("Castrated Animals: %s%n", allCastratedAnimals);

    }


}
