package _08_PolymorphismEX._01_Vehicles;

abstract class Vehicle {
    protected Double fuelQuantity = 0.0;
    protected Double consumptionPerKm = 0.0;

    public Vehicle(Double fuelQuantity, Double consumptionPerKm) {
        this.setFuelQuantity(fuelQuantity);
        this.setConsumptionPerKm(consumptionPerKm);
    }

     protected abstract void drive(Double distance);
     protected abstract void refuel(Double liters);

    private void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    private void setConsumptionPerKm(Double consumptionPerKm) {
        this.consumptionPerKm = consumptionPerKm;
    }
}
