package _08_PolymorphismEX._03_WildFarm;

import java.text.DecimalFormat;

class Mouse extends Mammal {
    public Mouse(String type, String name, Double weight, String region) {
        super(type, name, weight, region);
    }

    @Override
    protected void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    protected void eat(String foodName, int quantity) {
        if("Vegetables".equalsIgnoreCase(foodName)){
            setFoodEaten(quantity);
        }else{
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %d]",
                super.getType(),super.getName(),df.format(super.getWeight()), super.getRegion(), super.getFoodEaten());
    }
}
