package _02_DefiningClassesEX._06_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Car> cars = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = bf.readLine().split("\\s+");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            double pressureT1 = Double.parseDouble(tokens[5]);
            int ageT1 = Integer.parseInt(tokens[6]);
            double pressureT2 = Double.parseDouble(tokens[5]);
            int ageT2 = Integer.parseInt(tokens[6]);
            double pressureT3 = Double.parseDouble(tokens[5]);
            int ageT3 = Integer.parseInt(tokens[6]);
            double pressureT4 = Double.parseDouble(tokens[5]);
            int ageT4 = Integer.parseInt(tokens[6]);
            Engine newEngine = new Engine(engineSpeed, enginePower);
            Cargo newCargo = new Cargo(cargoWeight, cargoType);
            Tyres newTyres = new Tyres(pressureT1, ageT1, pressureT2, ageT2, pressureT3, ageT3, pressureT4, ageT4);
            Car newCar = new Car(model, newEngine, newCargo, newTyres);
            cars.add(newCar);
        }
        String command = bf.readLine();
        switch (command) {
            case "fragile":
                printFragileCargoes();
                break;
            case "flamable":
                printFlamableCargos();
                break;
        }
    }

    private static void printFlamableCargos() {
        cars.stream().filter(c -> c.getEngine().getEnginePower() > 250).forEach(c -> System.out.println(c.getModel()));
    }

    private static void printFragileCargoes() {
        cars.stream()
                .filter(x -> x.getCargo().getCargoType().equals("fragile"))
                .filter(y-> y.getTyres().getAveragePressure() < 1)
                .forEach(c -> System.out.println(c.getModel()));
    }
}
