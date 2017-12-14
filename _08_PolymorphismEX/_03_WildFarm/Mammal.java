package _08_PolymorphismEX._03_WildFarm;

abstract class Mammal extends Animal {
    private String region;

    public Mammal(String type, String name, Double weight, String region) {
        super(type, name, weight);
        this.region = region;
    }

    public String getRegion() {
        return this.region;
    }
}
