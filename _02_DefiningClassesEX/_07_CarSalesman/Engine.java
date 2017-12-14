package _02_DefiningClassesEX._07_CarSalesman;

class Engine {
    private String name;
    private int power;
    private int displacement = 0;
    private String efficiency = "n/a";

    public Engine(){
    }

    public Engine(String name, int power){
        this.name = name;
        this.power = power;
    }

    public Engine(String name, int power, int displacement){
        this(name, power);
        this.displacement = displacement;
    }

    public Engine(String name, int power, String efficiency){
        this(name, power);
        this.efficiency = efficiency;
    }

    public Engine(String name, int power, int displacement, String efficiency){
        this(name, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDisplacement() {
        return this.displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return this.efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
}
