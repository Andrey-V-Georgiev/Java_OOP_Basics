package systemIn.core;

import systemIn.hardwares.Hardware;
import systemIn.hardwares.HeavyHardware;
import systemIn.hardwares.PowerHardware;
import systemIn.softwares.ExpressSoftware;
import systemIn.softwares.LightSoftware;
import systemIn.softwares.SoftwareComponent;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TheSystem {
    public static LinkedHashMap<String, Hardware> hardwareComponents;

    public TheSystem() {
        hardwareComponents = new LinkedHashMap<>();
    }

    public void registerPowerHardware(String name, int capacity, int memory) {
        PowerHardware newPowerHardware = new PowerHardware(name, capacity, memory);
        hardwareComponents.putIfAbsent(name, newPowerHardware);
    }

    public void registerHeavyHardware(String name, int capacity, int memory) {
        HeavyHardware newHeavyHardware = new HeavyHardware(name, capacity, memory);
        hardwareComponents.putIfAbsent(name, newHeavyHardware);
    }

    public void registerExpressSoftware(String hardwareComponentName, String name, int capacityConsumption, int memoryConsumption) {
        if (hardwareComponents.containsKey(hardwareComponentName)) {
            int hardwareCapacity = hardwareComponents.get(hardwareComponentName).getCapacity();
            int hardwareMemory = hardwareComponents.get(hardwareComponentName).getMemory();
            if ((hardwareCapacity - capacityConsumption) >= 0 && (hardwareMemory - memoryConsumption) >= 0) {
                ExpressSoftware newExpressSoftware = new ExpressSoftware(hardwareComponentName, name, capacityConsumption, memoryConsumption);
                hardwareComponents.get(hardwareComponentName).registerSoftwareComponent(newExpressSoftware);
            }
        }
    }

    public void registerLightSoftware(String hardwareComponentName, String name, int capacityConsumption, int memoryConsumption) {
        if (hardwareComponents.containsKey(hardwareComponentName)) {
            int hardwareCapacity = hardwareComponents.get(hardwareComponentName).getCapacity();
            int hardwareMemory = hardwareComponents.get(hardwareComponentName).getMemory();
            LightSoftware newLightSoftware = new LightSoftware(hardwareComponentName, name, capacityConsumption, memoryConsumption);
            hardwareComponents.get(hardwareComponentName).registerSoftwareComponent(newLightSoftware);
        }
    }

    public void releaseSoftwareComponent(String hardwareComponentName, String softwareComponentName) {
        if (hardwareComponents.containsKey(hardwareComponentName)) {
            hardwareComponents.get(hardwareComponentName).destroys(softwareComponentName);
        }
    }

    public String analyze() {
        StringBuilder sb = new StringBuilder();
        sb.append("System Analysis\n");
        sb.append(String.format("Hardware Components: %d%n", hardwareComponents.size()));
        sb.append(String.format("Software Components: %d%n", hardwareComponents.values().stream().mapToInt(Hardware::countOfSoftwareComponents).sum()));
        sb.append(String.format("Total Operational Memory: %d / %d%n", totalOperationalMemoryInUse(), maximumMemory()));
        sb.append(String.format("Total Capacity Taken: %d / %d%n", totalCapacityTaken(), maximumCapacity()));
        return sb.toString();
    }

    private int maximumCapacity() {
        int maximumCapacity = 0;
        for (Hardware hardwareComponent : hardwareComponents.values()) {
            maximumCapacity += hardwareComponent.getCapacity();
        }
        return maximumCapacity;
    }

    private int totalCapacityTaken() {
        int totalCapacityTaken = 0;
        for (Hardware hardwareComponent : hardwareComponents.values()) {
            totalCapacityTaken += hardwareComponent.getCapacityInUse();
        }
        return totalCapacityTaken;
    }

    private int maximumMemory() {
        int maximumMemory = 0;
        for (Hardware hardwareComponent : hardwareComponents.values()) {
            maximumMemory += hardwareComponent.getMemory();
        }
        return maximumMemory;
    }

    private int totalOperationalMemoryInUse() {
        int totalOperationalMemoryInUse = 0;
        for (Hardware hardwareComponent : hardwareComponents.values()) {
            totalOperationalMemoryInUse += hardwareComponent.getMemoryInUse();
        }
        return totalOperationalMemoryInUse;
    }

    public String split() {
        StringBuilder sb = new StringBuilder();
        for (Hardware hardwareComponent : hardwareComponents.values()) {
            sb.append(String.format("Hardware Component – %s%n", hardwareComponent.getName()));
            sb.append(String.format("Express Software Components: %d%n", countOfExpressSoftwareComponents()));
            sb.append(String.format("Light Software Components: %d%n", countOfLightSoftwareComponents()));
            sb.append(String.format("Memory Usage: %d / %d%n", hardwareComponent.getMemory(), hardwareComponent.getMemory()));
            sb.append(String.format("Capacity Usage: %d / %d%n", hardwareComponent.getCapacity(), hardwareComponent.getCapacity()));
            sb.append(String.format("Type: %s%n", hardwareComponent.getType()));
            sb.append(String.format("Software Components: %s%n", softwareComponentsNames(hardwareComponent)));
        }
        return sb.toString();
    }

    private Object softwareComponentsNames(Hardware hardwareComponent) {
        List<String> softwareComponentsNames = hardwareComponent.getSoftwareComponents().values().stream().map(SoftwareComponent::getName).collect(Collectors.toList());
        return softwareComponentsNames.size() > 0 ? String.join(", ", softwareComponentsNames) : "None";
    }


    private int countOfLightSoftwareComponents() {
        int countOfLightSoftwareComponents = 0;
        for (Hardware hardwareComponent : hardwareComponents.values()) {
            countOfLightSoftwareComponents += hardwareComponent.getSoftwareComponents().values()
                    .stream().filter(x -> x.getType().equals("LightSoftware")).count();
        }
        return countOfLightSoftwareComponents;
    }

    private int countOfExpressSoftwareComponents() {
        int countOfExpressSoftwareComponents = 0;
        for (Hardware hardwareComponent : hardwareComponents.values()) {
            countOfExpressSoftwareComponents += hardwareComponent.getSoftwareComponents().values()
                    .stream().filter(x -> x.getType().equals("ExpressSoftware")).count();
        }
        return countOfExpressSoftwareComponents;
    }

}
