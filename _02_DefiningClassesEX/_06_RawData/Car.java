package _02_DefiningClassesEX._06_RawData;

class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tyres tyres;

    public Car(String model, Engine engine, Cargo cargo, Tyres tyres){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tyres = tyres;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Tyres getTyres() {
        return this.tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
