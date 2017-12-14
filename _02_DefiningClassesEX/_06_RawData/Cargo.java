package _02_DefiningClassesEX._06_RawData;

class Cargo {
    public int cargoWeight;
    public String cargoType;

    public Cargo(int weight, String type){
        this.cargoWeight = weight;
        this.cargoType = type;
    }

    public int getCargoWeight(){
        return this.cargoWeight;
    }

    public void setCargoWeight(int weight){
        this.cargoWeight = weight;
    }

    public String getCargoType(){
        return this.cargoType;
    }

    public void setCargoType(String type){
        this.cargoType = type;
    }
}
