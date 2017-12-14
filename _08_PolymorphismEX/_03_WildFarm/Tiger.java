package _08_PolymorphismEX._03_WildFarm;

import java.text.DecimalFormat;

public class Tiger extends Felime {
    public Tiger(String type, String name, Double weight, String region) {
        super(type, name, weight, region);
    }

    @Override
    protected void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    protected void eat(String foodName, int quantity) {
        if("Meat".equalsIgnoreCase(foodName)){
            setFoodEaten(quantity);
        }else{
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %d]",
                super.getType(),super.getName(),df.format(super.getWeight()), super.getRegion(), super.getFoodEaten());
    }
}
