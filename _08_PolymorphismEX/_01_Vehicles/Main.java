package _08_PolymorphismEX._01_Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] carDetails = bf.readLine().split("\\s+");
        Double carFuel = Double.parseDouble(carDetails[1]);
        Double carConsumption = Double.parseDouble(carDetails[2]);
        Car newCar = new Car(carFuel, carConsumption);

        String[] truckDetails = bf.readLine().split("\\s+");
        Double truckFuel = Double.parseDouble(truckDetails[1]);
        Double truckConsumption = Double.parseDouble(truckDetails[2]);
        Truck newTruck = new Truck(truckFuel, truckConsumption);

        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = bf.readLine().split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Drive":
                    String vehicle = tokens[1];
                    Double distance = Double.parseDouble(tokens[2]);
                    switch (vehicle) {
                        case "Car":
                            newCar.drive(distance);
                            break;
                        case "Truck":
                            newTruck.drive(distance);
                            break;
                    }
                    break;
                case "Refuel":
                    vehicle = tokens[1];
                    Double liters = Double.parseDouble(tokens[2]);
                    switch (vehicle) {
                        case "Car":
                            newCar.refuel(liters);
                            break;
                        case "Truck":
                            newTruck.refuel(liters);
                            break;
                    }

                    break;
            }
        }
        System.out.printf("Car: %.2f%n",newCar.getFuelQuantity());
        System.out.printf("Truck: %.2f%n",newTruck.getFuelQuantity());
    }
}
