package _08_PolymorphismEX._03_WildFarm;

abstract class Animal {
    private String type;
    private String name;
    private Double weight;
    private int foodEaten;

    public Animal(String type, String name, Double weight) {
        this.type = type;
        this.name = name;
        this.weight = weight;
    }

    public int getFoodEaten() {
        return this.foodEaten;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public Double getWeight() {
        return this.weight;
    }

    protected void setFoodEaten(int quantity){
        this.foodEaten += quantity;
    }

    abstract void makeSound();

    abstract void eat(String foodName, int quantity);
}
