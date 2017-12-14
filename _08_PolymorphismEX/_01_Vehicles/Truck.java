package _08_PolymorphismEX._01_Vehicles;

import java.text.DecimalFormat;

class Truck extends Vehicle {

    public Truck(Double fuelQuantity, Double consumptionPerKm) {

        super(fuelQuantity, consumptionPerKm + 1.6);
    }

    public Double getFuelQuantity(){
        return this.fuelQuantity;
    }

    @Override
    protected void drive(Double distance) {

        if((super.fuelQuantity-(distance * super.consumptionPerKm)) >= 0){
            super.fuelQuantity -= distance * super.consumptionPerKm;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.printf("Truck travelled %s km%n",df.format(distance));
        } else {
            System.out.printf("Truck needs refueling%n");
        }
    }

    @Override
    protected void refuel(Double liters) {
        super.fuelQuantity += liters * 0.95;
    }
}
