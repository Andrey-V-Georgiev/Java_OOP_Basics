package _04_EncapsulationEX._05_PizzaCalories;

class Dough {
    private String flourType;
    private String backingTechnique;
    private int weightInGrams;

    public Dough(){
    }

    public Dough(String flourType, String backingTechnique, int weightInGrams) {
        setFlourType(flourType);
        setBackingTechnique(backingTechnique);
        setWeightInGrams(weightInGrams);
    }

    public double calculateDoughCalories(){
        double calories = 0;
        switch (this.flourType){
            case "White":
                calories = this.weightInGrams * 1.5;
                break;
            case "Wholegrain":
                calories = this.weightInGrams * 1.0;
                break;
            default:
                break;

        }

        switch (this.backingTechnique){
            case "Crispy":
                calories *= 0.9;
                break;
            case "Chewy":
                calories *= 1.1;
                break;
            case "Homemade":
                calories *= 1.0;
                break;
                default:
                    break;
        }
        return calories;
    }

    private void setFlourType(String flourType) {
        if(flourType.equalsIgnoreCase("White") || flourType.equalsIgnoreCase("Wholegrain")){
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    private void setBackingTechnique(String backingTechnique) {
        if(backingTechnique.equalsIgnoreCase("Crispy")
                || backingTechnique.equalsIgnoreCase("Chewy")
                || backingTechnique.equalsIgnoreCase("Homemade")){
            this.backingTechnique = backingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeightInGrams(int weightInGrams) {
       if(weightInGrams < 1 || weightInGrams > 200){
           throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
       }
        this.weightInGrams = weightInGrams;
    }
}
