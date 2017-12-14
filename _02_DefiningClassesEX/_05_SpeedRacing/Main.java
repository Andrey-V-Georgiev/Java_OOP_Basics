package _02_DefiningClassesEX._05_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    static Map<String, Car> cars = new LinkedHashMap<>();
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        readTheCars();
        processTheCommands();
        printResults();
    }

    private static void printResults() {
        for (Map.Entry<String, Car> car : cars.entrySet()) {
            System.out.printf("%s %.2f %d%n",car.getKey(), car.getValue().getFuel(), (int)car.getValue().getMileage());
        }
    }

    private static void processTheCommands() throws IOException {
        String[] tokens = bf.readLine().split("\\s+");
        while(!"End".equalsIgnoreCase(tokens[0])){
            String model = tokens[1];
            double kmAmount = Double.parseDouble(tokens[2]);
            cars.get(model).drive(kmAmount);
            tokens = bf.readLine().split("\\s+");
        }
    }

    private static void readTheCars() throws IOException {
        int numberOfCars = Integer.parseInt(bf.readLine());
        for (int i = 0; i < numberOfCars; i++) {
            String[] tokens = bf.readLine().split("\\s+");
            String model = tokens[0];
            double fuel = Double.parseDouble(tokens[1]);
            double consumption = Double.parseDouble(tokens[2]);
            Car newCar = new Car(fuel, consumption);
            cars.put(model, newCar);
        }
    }
}
