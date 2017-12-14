package _08_PolymorphismEX._02_VehiclesExtension;

abstract class Vehicle {

    protected Double fuelQuantity = 0.0;
    protected Double consumptionPerKm = 0.0;
    protected Double tankCapacity = 0.0;

    public Vehicle(Double fuelInitial, Double consumptionPerKm, Double tankCapacity) {
        this.setFuelQuantity(fuelInitial);
        this.setConsumptionPerKm(consumptionPerKm);
        this.setTankCapacity(tankCapacity);
    }

    protected abstract void drive(Double distance);
    protected abstract void drive(Double distance, Double clima);

    protected abstract void refuel(Double liters);

    private void setFuelQuantity(Double fuelInitial) {
        this.fuelQuantity = fuelInitial;
    }

    protected void setConsumptionPerKm(Double consumptionPerKm) {
        this.consumptionPerKm = consumptionPerKm;
    }

    private void setTankCapacity(Double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
}
