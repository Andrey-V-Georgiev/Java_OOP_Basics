package _04_EncapsulationEX._05_PizzaCalories;

import java.util.ArrayList;

class Pizza {
    private String name;
    private Dough dough;
    private ArrayList<Topping> toppings;

    public Pizza(String name){
        setName(name);
        this.dough = new Dough();
        this.toppings = new  ArrayList<>();
    }

    public Pizza(String name, Dough dough, ArrayList<Topping> toppings) {
        setName(name);
        setDough(dough);
        setToppings(toppings);
    }

    private void setName(String name) {
        if(name.isEmpty() || name.length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(ArrayList<Topping> toppings) {
        this.toppings = new ArrayList<>(toppings);
    }

    public double calculateCalories(){
        double doughCalories = this.dough.calculateDoughCalories();
        double toppingListCalories = toppings.stream().mapToDouble(x-> x.calculateToppingCalories()).sum();
        double sum = doughCalories + toppingListCalories;
        return sum * 2;
    }
}
