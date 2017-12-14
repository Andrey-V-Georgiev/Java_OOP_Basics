package _08_PolymorphismEX._01_Vehicles;

import java.text.DecimalFormat;

class Car extends Vehicle {

    public Car(Double fuelQuantity, Double consumptionPerKm) {
        super(fuelQuantity, consumptionPerKm + 0.9);
    }

    public Double getFuelQuantity(){
        return this.fuelQuantity;
    }

    @Override
    protected void drive(Double distance) {

        if((super.fuelQuantity-(distance * super.consumptionPerKm)) >= 0){
            super.fuelQuantity -= distance * super.consumptionPerKm;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.printf("Car travelled %s km%n",df.format(distance));
        } else {
            System.out.printf("Car needs refueling%n");
        }
    }

    @Override
    protected void refuel(Double liters) {
        super.fuelQuantity += liters;
    }
}
