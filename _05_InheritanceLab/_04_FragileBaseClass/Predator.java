package _05_InheritanceLab._04_FragileBaseClass;

import java.util.ArrayList;

public class Predator extends Animal{
    private int health;

    public Predator(){
        super(new ArrayList<>());
        this.health = 0;
    }

    public int getHealth(){
        return this.health;
    }

    public void feed(Food food){
        super.eat(food);
        this.health++;
    }
}
