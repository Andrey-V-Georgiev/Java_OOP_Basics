package systemIn.softwares;

import systemIn.core.Component;

public abstract class SoftwareComponent extends Component{
    private int capacityConsumption;
    private int memoryConsumption;

    protected SoftwareComponent(String name, int capacity, int memory) {
        super(name);
        this.setCapacityConsumption(capacity);
        this.setMemoryConsumption(memory);
    }

    @Override
    public int getCapacity() {
        return this.capacityConsumption;
    }

    protected void setCapacityConsumption(int capacity) {
        this.capacityConsumption = capacity;
    }

    @Override
    public int getMemory() {
        return this.memoryConsumption;
    }

    protected void setMemoryConsumption(int memory) {
        this.memoryConsumption = memory;
    }
}
