package _08_PolymorphismEX._02_VehiclesExtension;

import java.text.DecimalFormat;

class Truck extends Vehicle {
    public Truck(Double fuelQuantity, Double consumptionPerKm, Double tankCapacity) {

        super(fuelQuantity, consumptionPerKm + 1.6, tankCapacity);
    }

    public Double getFuelQuantity() {
        return this.fuelQuantity;
    }

    @Override
    public void drive(Double distance) {

        if ((super.fuelQuantity - (distance * super.consumptionPerKm)) >= 0) {
            super.fuelQuantity -= distance * super.consumptionPerKm;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.printf("Truck travelled %s km%n", df.format(distance));
        } else {
            System.out.printf("Truck needs refueling%n");
        }
    }

    @Override
    protected void drive(Double distance, Double clima) {

    }

    @Override
    public void refuel(Double liters) {
        if (liters < 1) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else if (((liters * 0.95)+ super.fuelQuantity) > tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.fuelQuantity += liters * 0.95;
    }
}
