package pawInc2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        AnimalCenterManager animalCenterManager = new AnimalCenterManager();

        String input = bf.readLine();
        while (true) {
            String[] tokens = input.split("\\s\\|\\s");
            if ("Paw Paw Pawah".equalsIgnoreCase(input)) {
                animalCenterManager.printStatistics();
                return;
            }
            String command = tokens[0];
            switch (command) {

                case "RegisterCleansingCenter":
                    String cleansingCenterName = tokens[1];
                    animalCenterManager.registerCleansingCenter(cleansingCenterName);
                    break;

                case "RegisterAdoptionCenter":
                    String adoptionCenterName = tokens[1];
                    animalCenterManager.registerAdoptionCenter(adoptionCenterName);
                    break;

                case "RegisterDog":
                    String dogName = tokens[1];
                    int dogAge = Integer.parseInt(tokens[2]);
                    int learnedCommands = Integer.parseInt(tokens[3]);
                    adoptionCenterName = tokens[4];
                    animalCenterManager.registerDog(dogName, dogAge, learnedCommands, adoptionCenterName);
                    break;

                case "RegisterCat":
                    String catName = tokens[1];
                    int catAge = Integer.parseInt(tokens[2]);
                    int intelligenceCoefficient = Integer.parseInt(tokens[3]);
                    adoptionCenterName = tokens[4];
                    animalCenterManager.registerCat(catName,catAge,intelligenceCoefficient,adoptionCenterName);
                    break;

                case "SendForCleansing":
                    adoptionCenterName = tokens[1];
                    cleansingCenterName = tokens[2];
                    animalCenterManager.sendForCleansing(adoptionCenterName,cleansingCenterName);
                    break;

                case "Cleanse":
                    cleansingCenterName = tokens[1];
                    animalCenterManager.cleanse(cleansingCenterName);
                    break;

                case "Adopt":
                    adoptionCenterName = tokens[1];
                    animalCenterManager.adopt(adoptionCenterName);
                    break;

                case "RegisterCastrationCenter":
                    String castrationCenterName = tokens[1];
                    animalCenterManager.registerCastrationCenter(castrationCenterName);
                    break;

                case "SendForCastration":
                    adoptionCenterName = tokens[1];
                    castrationCenterName = tokens[2];
                    animalCenterManager.sendForCastration(adoptionCenterName, castrationCenterName);
                    break;

                case "Castrate":
                    castrationCenterName = tokens[1];
                    animalCenterManager.castrate(castrationCenterName);
                    break;

                case "CastrationStatistics":
                    animalCenterManager.castrationStatistics();
                    break;
            }
            input = bf.readLine();
        }
    }
}
