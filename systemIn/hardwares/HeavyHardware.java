package systemIn.hardwares;


public class HeavyHardware extends Hardware {
    public HeavyHardware(String name, int capacity, int memory) {
        super(name, capacity, memory);
        super.setType("Heavy");
    }

    @Override
    public void setCapacity(int capacity) {
        int increaseCapacity = capacity * 2;
        super.setCapacity(increaseCapacity);
    }

    @Override
    public void setMemory(int memory){
        int decreaseMemory = memory - (memory * 25) / 100;
        super.setMemory(decreaseMemory);
    }
}
