package _02_DefiningClassesEX._07_CarSalesman;

class Car {
    private String carModel;
    private Engine engine;
    private int weight;
    private String color = "n/a";

    public Car(){

    }

    public Car(String carModel, Engine engine){
        this.carModel = carModel;
        this.engine = engine;
    }

    public Car(String carModel, Engine engine, int weight){
        this(carModel, engine);
        this.weight = weight;
    }

    public Car(String carModel, Engine engine, String color){
        this(carModel, engine);
        this.color = color;
    }

    public Car(String carModel, Engine engine, int weight, String color){
        this(carModel, engine);
        this.weight = weight;
        this.color = color;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
