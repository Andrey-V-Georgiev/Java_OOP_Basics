package _08_PolymorphismEX._03_WildFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] animalData = bf.readLine().split("\\s+");
        while (!"End".equalsIgnoreCase(animalData[0])) {
            String[] food = bf.readLine().split("\\s+");

            String type = animalData[0];
            String name = animalData[1];
            Double weight = Double.parseDouble(animalData[2]);
            String region = animalData[3];
            String foodName = food[0];
            int quantity = Integer.parseInt(food[1]);

            switch (type) {
                case "Mouse":
                    Mouse mouse = new Mouse(type, name, weight, region);
                    mouse.makeSound();
                    try {
                        mouse.eat(foodName, quantity);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    animals.add(mouse);
                    break;

                case "Zebra":
                    Zebra zebra = new Zebra(type, name, weight, region);
                    zebra.makeSound();
                    try {
                        zebra.eat(foodName, quantity);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    animals.add(zebra);
                    break;

                case "Tiger":
                    Tiger tiger = new Tiger(type, name, weight, region);
                    tiger.makeSound();
                    try {
                        tiger.eat(foodName, quantity);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    animals.add(tiger);
                    break;

                case "Cat":
                    String breed = animalData[4];
                    Cat cat = new Cat(type, name, weight, region, breed);
                    cat.makeSound();
                    try {
                        cat.eat(foodName, quantity);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    animals.add(cat);
                    break;
            }
            animalData = bf.readLine().split("\\s+");
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
