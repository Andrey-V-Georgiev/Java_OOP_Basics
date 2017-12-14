package _04_EncapsulationEX._05_PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Topping> newToppingList = new ArrayList<>();
    static String pizzaName;
    static Pizza thePizza;
    static int numberOfToppings;
    static Dough newDough;

    public static void main(String[] args) throws IOException {

        while (true) {
            String[] tokens = bf.readLine().split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Pizza":
                    pizzaName = tokens[1];
                    numberOfToppings = Integer.parseInt(tokens[2]);
                    if (numberOfToppings > 10) {
                        System.out.println("Number of toppings should be in range [0..10].");
                       return;
                    }
                    thePizza = new Pizza(pizzaName);
                    break;
                case "Dough":
                    try {
                        String typeOfFlour = tokens[1].substring(0,1).toUpperCase() + tokens[1].substring(1);
                        String bakingTechnique = tokens[2].substring(0,1).toUpperCase() + tokens[2].substring(1);
                        int weightInGrams = Integer.parseInt(tokens[3]);
                        newDough = new Dough(typeOfFlour, bakingTechnique, weightInGrams);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        return;
                    }
                    break;
                case "Topping":
                    if(newToppingList.size() > numberOfToppings){
                        break;
                    }
                    try {
                        String toppingType = tokens[1].substring(0,1).toUpperCase() + tokens[1].substring(1);
                        int weight = Integer.parseInt(tokens[2]);
                        Topping newTopping = new Topping(toppingType, weight);
                        newToppingList.add(newTopping);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        return;
                    }
                    break;
                case "END":
                    Pizza newPizza = new Pizza(pizzaName, newDough, newToppingList);
                    double totalCalories = newPizza.calculateCalories();
                    System.out.printf("%s - %.2f", pizzaName, totalCalories);
                    return;

            }
        }
    }
}
