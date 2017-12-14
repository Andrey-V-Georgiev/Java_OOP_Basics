package _02_DefiningClassesEX._08_PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static LinkedHashMap<String, Trainer> trainers = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        receiveTheInput();
        doTheCommands();
        printTrainers();
    }

    private static void printTrainers() {
        trainers.entrySet().stream().sorted((a,b)-> Integer.compare(b.getValue().getBadges(),a.getValue().getBadges()))
                .forEach(t-> System.out.printf("%s %d %d%n", t.getKey(), t.getValue().getBadges(), t.getValue().getPokemons().size()));
    }

    private static void doTheCommands() throws IOException {
        String command = bf.readLine();
        while(!"End".equalsIgnoreCase(command)){
            switch(command){
                case "Fire":
                    checkForElement("Fire");
                    break;
                case "Water":
                    checkForElement("Water");
                    break;
                case "Electricity":
                    checkForElement("Electricity");
                    break;

            }
            command = bf.readLine();
        }
    }

    private static void checkForElement(String element) {
        for (Map.Entry<String, Trainer> trainer : trainers.entrySet()) {
            String trainerName = trainer.getKey();
            List<Pokemon> pokemons = trainer.getValue().getPokemons();
            long countOfMatches = pokemons.stream().filter(x->x.getElement().equals(element)).count();
            if(countOfMatches > 0){
                trainers.get(trainerName).setBadges(trainers.get(trainerName).getBadges() + 1);
            } else {
                trainers.get(trainerName).getPokemons().forEach(p-> p.setHealth(p.getHealth() - 10));
                Stream.of(trainers.get(trainerName).getPokemons().removeIf(p->p.getHealth()<1)).collect(Collectors.toList());
            }
        }
    }

    private static void receiveTheInput() throws IOException {
        String[] tokens = bf.readLine().split("\\s+");
        while(!"Tournament".equalsIgnoreCase(tokens[0])){
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);
            Pokemon newPokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            Trainer newTrainer = new Trainer(new ArrayList<>(Arrays.asList(newPokemon)));

            if(trainers.containsKey(trainerName)){
                trainers.get(trainerName).getPokemons().add(newPokemon);
            } else {
                trainers.put(trainerName, newTrainer);
            }
            tokens = bf.readLine().split("\\s+");
        }
    }
}
