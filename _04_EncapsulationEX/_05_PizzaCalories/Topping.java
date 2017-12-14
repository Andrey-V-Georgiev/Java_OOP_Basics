package _04_EncapsulationEX._05_PizzaCalories;

class Topping {
    private String toppingType;
    private int toppingWeight;

    public Topping(){
    }

    public Topping(String toppingType, int weightInGrams) {
        setToppingType(toppingType);
        setToppingWeight(weightInGrams, toppingType);
    }

    public double calculateToppingCalories() {
        double calories = 0;
        switch (this.toppingType) {
            case "Meat":
                calories = 1.2 * this.toppingWeight;
                break;
            case "Veggies":
                calories = 0.8 * this.toppingWeight;
                break;
            case "Cheese":
                calories = 1.1 * this.toppingWeight;
                break;
            case "Sauce":
                calories = 0.9 * toppingWeight;
                break;
            default:
        }
         return calories;
    }

    private void setToppingType(String toppingType) {
        if(toppingType.equalsIgnoreCase("Meat")
        || toppingType.equalsIgnoreCase("Veggies")
        || toppingType.equalsIgnoreCase("Cheese")
        || toppingType.equalsIgnoreCase("Sauce")
        ){
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }

    }

    private void setToppingWeight(int toppingWeight, String toppingType) {
       if(toppingWeight< 1 || toppingWeight > 50){
           throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", toppingType));
       }
        this.toppingWeight = toppingWeight;
    }
}
