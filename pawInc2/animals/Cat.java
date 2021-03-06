package pawInc2.animals;

public class Cat extends Animal {
    private int intelligenceCoefficient;

    public Cat(String name, int age, int intelligenceCoefficient) {
        super(name, age);
        this.setIntelligenceCoefficient(intelligenceCoefficient);
    }



    public int getIntelligenceCoefficient() {
        return this.intelligenceCoefficient;
    }


    protected void setIntelligenceCoefficient(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }
}
