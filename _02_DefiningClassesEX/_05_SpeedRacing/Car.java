package _02_DefiningClassesEX._05_SpeedRacing;

class Car {
    private double fuel;
    private double consumption;
    private double mileage = 0;

    public Car(double fuel, double consumption){
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public double getFuel(){
        return this.fuel;
    }

    public void setFuel(double fuelAmount){
        this.fuel = fuelAmount;
    }

    public double getConsumption(){
        return this.consumption;
    }

    public void setConsumption(double consumption){
        this.consumption = consumption;
    }

    public double getMileage(){
        return this.mileage;
    }

    public void drive(double kmAmount){
        double neededFuel = kmAmount * this.consumption;
        if(neededFuel <= this.fuel){
            this.mileage += kmAmount;
            this.fuel -= neededFuel;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }
}
