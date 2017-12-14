package _08_PolymorphismEX._02_VehiclesExtension;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] carDetails = bf.readLine().split("\\s+");
        Double carFuel = Double.parseDouble(carDetails[1]);
        Double carConsumption = Double.parseDouble(carDetails[2]);
        Double carCapacity = Double.parseDouble(carDetails[3]);
        Car newCar = new Car(carFuel, carConsumption, carCapacity);

        String[] truckDetails = bf.readLine().split("\\s+");
        Double truckFuel = Double.parseDouble(truckDetails[1]);
        Double truckConsumption = Double.parseDouble(truckDetails[2]);
        Double truckCapacity = Double.parseDouble(truckDetails[3]);
        Truck newTruck = new Truck(truckFuel, truckConsumption, truckCapacity);

        String[] busDetails = bf.readLine().split("\\s+");
        Double busFuel = Double.parseDouble(busDetails[1]);
        Double busConsumption = Double.parseDouble(busDetails[2]);
        Double busCapacity = Double.parseDouble(busDetails[3]);
        Bus newBus = new Bus(busFuel, busConsumption, busCapacity);

        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
          try {
              String[] tokens = bf.readLine().split("\\s+");
              String command = tokens[0];
              switch (command) {
                  case "DriveEmpty":
                      Double distance = Double.parseDouble(tokens[2]);
                      newBus.drive(distance, 0.0);
                      break;
                  case "Drive":
                      String vehicle = tokens[1];
                      distance = Double.parseDouble(tokens[2]);
                      switch (vehicle) {
                          case "Car":
                              newCar.drive(distance);
                              break;
                          case "Truck":
                              newTruck.drive(distance);
                              break;
                          case "Bus":
                              newBus.drive(distance, 1.4);
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
                          case "Bus":
                              newBus.refuel(liters);
                              break;
                      }

                      break;
              }
          }catch(IllegalArgumentException ex){
              System.out.println(ex.getMessage());
          }
        }
        System.out.printf("Car: %.2f%n", newCar.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", newTruck.getFuelQuantity());
        System.out.printf("Bus: %.2f%n", newBus.getFuelQuantity());
    }
}
