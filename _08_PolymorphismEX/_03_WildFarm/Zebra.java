package _08_PolymorphismEX._03_WildFarm;

import java.text.DecimalFormat;

class Zebra extends Mammal {
    public Zebra(String type, String name, Double weight, String region) {
        super(type, name, weight, region);
    }

    @Override
    protected void makeSound() {
        System.out.println("Zs");
    }

    @Override
    protected void eat(String foodName, int quantity) {
        if("Vegetables".equalsIgnoreCase(foodName)){
            setFoodEaten(quantity);
        }else{
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %d]",
                super.getType(),super.getName(),df.format(super.getWeight()), super.getRegion(), super.getFoodEaten());
    }
}
