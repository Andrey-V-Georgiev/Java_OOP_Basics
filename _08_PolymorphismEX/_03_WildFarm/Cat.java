package _08_PolymorphismEX._03_WildFarm;

import java.text.DecimalFormat;

class Cat extends Felime {
    private String breed;

    public Cat(String type, String name, Double weight, String region, String breed) {
        super(type, name, weight, region);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    protected void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    protected void eat(String foodName, int quantity) {
        setFoodEaten(quantity);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]",
                super.getType(), super.getName(), this.breed, df.format(super.getWeight()), super.getRegion(), super.getFoodEaten());
    }
}
