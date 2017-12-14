package systemIn.hardwares;

import systemIn.core.Component;
import systemIn.softwares.SoftwareComponent;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Hardware extends Component {
    private int capacity;
    private int memory;
    private int capacityInUse;
    private int memoryInUse;

    private LinkedHashMap<String, SoftwareComponent> softwareComponents;

    protected Hardware(String name, int capacity, int memory) {
        super(name);
        this.setCapacity(capacity);
        this.setMemory(memory);
        this.softwareComponents = new LinkedHashMap<>();
    }

    public int getMemoryInUse() {
        return this.memoryInUse;
    }

    public int getCapacityInUse() {
        return this.capacityInUse;
    }

    public Map<String, SoftwareComponent> getSoftwareComponents() {
        return Collections.unmodifiableMap(this.softwareComponents);
    }

    public int countOfSoftwareComponents() {
        return this.softwareComponents.size();
    }

    public boolean containSoftwareComponent(String softwareComponentName) {
        return this.softwareComponents.containsKey(softwareComponentName);
    }

    public void destroys(String name) {
        if(this.softwareComponents.containsKey(name)){
            this.softwareComponents.remove(name);
        }
    }

    public void registerSoftwareComponent(SoftwareComponent component) {
        if (this.capacityInUse + component.getCapacity() <= this.capacity && this.memoryInUse + component.getMemory() <= this.memory) {
            this.softwareComponents.put(component.getName(), component);
            this.capacityInUse += component.getCapacity();
            this.memoryInUse += component.getMemory();
        }
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
        this.capacityInUse = 0;
    }

    @Override
    public int getMemory() {
        return this.memory;
    }

    protected void setMemory(int memory) {
        this.memory = memory;
        this.memoryInUse = 0;
    }
}
