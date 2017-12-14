package _02_DefiningClassesEX._09_Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static HashMap<String, Person> people = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = bf.readLine().split("\\s+");
        while (!"End".equalsIgnoreCase(tokens[0])) {
            String currentName = tokens[0];
            people.putIfAbsent(currentName, new Person());
            people.get(currentName).setPerson(tokens);
            tokens = bf.readLine().split("\\s+");
        }
        printDetailsForThisPerson(bf.readLine());
    }

    private static void printDetailsForThisPerson(String nameOfTheMen) {
        Person theMen = people.get(nameOfTheMen);
        System.out.println(nameOfTheMen);
        try {
            System.out.println("Company:");
            System.out.printf("%s %s %.2f%n", theMen.getCompany()
                    .getCompanyName(), theMen.getCompany().getCompanyDepartment(), theMen.getCompany().gerSalary());
        } catch (Exception e) {
        }
        try {
            System.out.println("Car:");
            System.out.printf("%s %d%n", theMen.getCar().getCarModel(), theMen.getCar().getCarSpeed());
        } catch (Exception e) {
        }
        try {
            System.out.println("Pokemon:");
            for (Pokemon pokemon : theMen.getPokemons()) {
                System.out.printf("%s %s%n", pokemon.getPokemonName(), pokemon.getPokemonType());
            }
        } catch (Exception e) {
        }
        try {
            System.out.println("Parents:");
            for (Parent parent : theMen.getParents()) {
                System.out.printf("%s %s%n", parent.getParentName(), parent.getParentBirthday());
            }
        } catch (Exception e) {
        }
        try {
            System.out.println("Children:");
            for (Child child : theMen.getChildren()) {
                System.out.printf("%s %s%n", child.getChildName(), child.getChildBirthday());
            }
        } catch (Exception e) {
        }

    }
}
