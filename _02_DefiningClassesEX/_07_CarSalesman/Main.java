package _02_DefiningClassesEX._07_CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static List<Car> cars = new ArrayList<>();
    static HashMap<String, Engine> engines = new HashMap<>();

    public static void main(String[] args) throws IOException {
        readTheEngines();
        readTheCars();
        printResults();
    }

    private static void printResults() {
        for (Car car : cars) {
            System.out.printf("%s:%n", car.getCarModel());
            Engine engine = car.getEngine();
            System.out.printf("  %s:%n", engine.getName());
            System.out.printf("  Power: %d%n", engine.getPower());
            String currentDisplacement = engine.getDisplacement() == 0 ? "n/a" : "" + engine.getDisplacement();
            System.out.printf("    Displacement: %s%n", currentDisplacement);
            System.out.printf("    Efficiency: %s%n", engine.getEfficiency());
            String currentWeight =  car.getWeight() == 0 ? "n/a" : "" + car.getWeight();
            System.out.printf("  Weight: %s%n", currentWeight);
            System.out.printf("  Color: %s%n", car.getColor());
        }
    }

    private static void readTheCars() throws IOException {
        int m = Integer.parseInt(bf.readLine());
        for (int i = 0; i < m; i++) {
            String[] tokens = bf.readLine().split("\\s+");
            int tokensLength = tokens.length;
            String carModel = tokens[0];
            String engineModel = tokens[1];
            if (engines.containsKey(engineModel)) {
                Car newCar = new Car();
                Engine currentEngine = engines.get(engineModel);
                switch (tokensLength) {
                    case 2:
                        newCar = new Car(carModel, currentEngine);
                        break;
                    case 3:
                        String thirdArgument = tokens[2];
                        if (Character.isDigit(thirdArgument.charAt(0))) {
                            newCar = new Car(carModel, currentEngine, Integer.parseInt(thirdArgument));
                        } else {
                            newCar = new Car(carModel, currentEngine, thirdArgument);
                        }
                        break;
                    case 4:
                        int weight = Integer.parseInt(tokens[2]);
                        String color = tokens[3];
                        newCar = new Car(carModel, currentEngine, weight, color);
                        break;
                }
                cars.add(newCar);
            }
        }
    }

    private static void readTheEngines() throws IOException {
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = bf.readLine().split("\\s+");
            int tokensLength = tokens.length;
            String engineModel = tokens[0];
            int power = Integer.parseInt(tokens[1]);
            Engine newEngine = new Engine();
            switch (tokensLength) {
                case 2:
                    newEngine = new Engine(engineModel, power);
                    break;
                case 3:
                    String thirdArgument = tokens[2];
                    if (Character.isDigit(thirdArgument.charAt(0))) {
                        newEngine = new Engine(engineModel, power, Integer.parseInt(thirdArgument));
                    } else {
                        newEngine = new Engine(engineModel, power, thirdArgument);
                    }
                    break;
                case 4:
                    int displacement = Integer.parseInt(tokens[2]);
                    String efficiency = tokens[3];
                    newEngine = new Engine(engineModel, power, displacement, efficiency);
                    break;
            }
            engines.put(engineModel, newEngine);
        }
    }
}
