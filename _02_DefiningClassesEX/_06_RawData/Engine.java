package _02_DefiningClassesEX._06_RawData;

class Engine {
    private int engineSpeed;
    private int enginePower;

    public Engine(int speed, int power){
        this.engineSpeed = speed;
        this.enginePower = power;
    }

    public int getEngineSpeed(){
        return this.engineSpeed;
    }

    public void setEngineSpeed(int speed){
        this.engineSpeed = speed;
    }

    public int getEnginePower(){
        return this.enginePower;
    }

    public void setEnginePower(int power){
        this.enginePower = power;
    }
}
