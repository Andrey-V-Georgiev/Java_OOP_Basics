package _08_PolymorphismEX._02_VehiclesExtension;

import java.text.DecimalFormat;

class Car extends Vehicle {

    public Car(Double fuelQuantity, Double consumptionPerKm, Double tankCapacity) {
        super(fuelQuantity, consumptionPerKm + 0.9, tankCapacity);
    }

    public Double getFuelQuantity() {
        return this.fuelQuantity;
    }

    @Override
    public void drive(Double distance) {

        if ((super.fuelQuantity - (distance * super.consumptionPerKm)) >= 0) {
            super.fuelQuantity -= distance * super.consumptionPerKm;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.printf("Car travelled %s km%n", df.format(distance));
        } else {
            System.out.printf("Car needs refueling%n");
        }
    }

    @Override
    protected void drive(Double distance, Double clima) {

    }

    @Override
    public void refuel(Double liters) {
        if (liters < 1) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else if ((liters + super.fuelQuantity) > tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.fuelQuantity += liters;
    }
}
