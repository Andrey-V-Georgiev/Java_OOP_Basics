package _06_InheritanceEX._06_Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String type = bf.readLine();
        while (!"Beast!".equalsIgnoreCase(type)) {
            String[] tokens = bf.readLine().split("\\s+");
            String name = tokens[0];
            String age = tokens[1];
            String gender = tokens[2];
            try {
                Animal newAnimal = createNewAnimal(type, name, age, gender);
                animals.add(newAnimal);
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
            type = bf.readLine();
        }
        printResults();
    }

    private static void printResults() {
        for (Animal animal : animals) {
            System.out.println(animal.getType());
            System.out.println(animal.getData());
            animal.produceSound();
        }
    }

    private static Animal createNewAnimal(String type, String name, String age, String gender) throws Exception {
        Animal newAnimal = new Animal();
        switch (type) {
            case "Dog":
                newAnimal = new Dog(type, name, age, gender);
                break;
            case "Cat":
                newAnimal = new Cat(type, name, age, gender);
                break;
            case "Frog":
                newAnimal = new Frog(type, name, age, gender);
                break;
            case "Kitten":
                newAnimal = new Kitten(type, name, age, gender);
                break;
            case "Tomcat":
                newAnimal = new Tomcat(type, name, age, gender);
                break;
            case "Animal":
                newAnimal = new Animal(type, name, age, gender);
                break;
        }
        return newAnimal;
    }
}
