package systemIn.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        TheSystem theSystem = new TheSystem();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        while (true) {
            if ("System Split".equals(input)) {
                theSystem.split();
            }
            String[] tokens = input.split("([()]|, )");
            String type = tokens[0];
            switch (type) {
                case "RegisterPowerHardware":
                    String name = tokens[1];
                    int capacity = Integer.parseInt(tokens[2]);
                    int memory = Integer.parseInt(tokens[3]);
                    theSystem.registerPowerHardware(name, capacity, memory);
                    break;
                case "RegisterHeavyHardware":
                    name = tokens[1];
                    capacity = Integer.parseInt(tokens[2]);
                    memory = Integer.parseInt(tokens[3]);
                    theSystem.registerHeavyHardware(name, capacity, memory);
                    break;
                case "RegisterExpressSoftware":
                    String hardwareComponentName = tokens[1];
                    name = tokens[2];
                    capacity = Integer.parseInt(tokens[3]);
                    memory = Integer.parseInt(tokens[4]);
                    theSystem.registerExpressSoftware(hardwareComponentName, name, capacity, memory);
                    break;
                case "RegisterLightSoftware":
                    hardwareComponentName = tokens[1];
                    name = tokens[2];
                    capacity = Integer.parseInt(tokens[3]);
                    memory = Integer.parseInt(tokens[4]);
                    theSystem.registerLightSoftware(hardwareComponentName, name, capacity, memory);
                    break;
                case "ReleaseSoftwareComponent":
                    hardwareComponentName = tokens[1];
                    String softwareComponentName = tokens[2];
                    theSystem.releaseSoftwareComponent(hardwareComponentName, softwareComponentName);
                    break;
                case "Analyze":
                    System.out.print(theSystem.analyze());
                    break;
            }

            input = bf.readLine();
        }
    }
}
