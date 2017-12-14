package _05_InheritanceLab._04_FragileBaseClass;

import java.util.List;

class Animal {
    protected List<Food> foodEaten;

    public Animal(List<Food> foods){
        this.foodEaten = foods;
    }

    public final void eat(Food food){
        this.foodEaten.add(food);
    }

    public void eatAll(Food[] allFoods){
        for (Food food : allFoods) {
            this.eat(food);
        }
    }

}
