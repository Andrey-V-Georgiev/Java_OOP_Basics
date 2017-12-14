package _08_PolymorphismEX._02_VehiclesExtension;

import java.text.DecimalFormat;

class Bus extends Vehicle {

    public Bus(Double fuelQuantity, Double consumptionPerKm, Double tankCapacity) {
        super(fuelQuantity, consumptionPerKm, tankCapacity);
    }

    public Double getFuelQuantity(){
        return this.fuelQuantity;
    }

    @Override
    protected void drive(Double distance) {

    }

    @Override
    public void drive(Double distance, Double clima) {

        if ((super.fuelQuantity - (distance * (super.consumptionPerKm + clima))) >= 0) {
            super.fuelQuantity -= distance * (super.consumptionPerKm + clima);
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.printf("Bus travelled %s km%n", df.format(distance));
        } else {
            System.out.printf("Bus needs refueling%n");
        }
    }

    @Override
    public void refuel(Double liters) {
        if (liters < 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else if ((liters + super.fuelQuantity) > tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

        super.fuelQuantity += liters;
    }
}
