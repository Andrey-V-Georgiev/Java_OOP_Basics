package systemIn.hardwares;


public class PowerHardware extends Hardware {

    public PowerHardware(String name, int capacity, int memory) {
        super(name, capacity, memory);
        super.setType("Power");
    }

    @Override
    protected void setCapacity(int capacity) {
       int decreasedCapacity = capacity - (capacity * 75) / 100;
        super.setCapacity(decreasedCapacity);
    }

    @Override
    protected void setMemory(int memory){
        int increasedMemory = memory + (memory * 75) / 100;
        super.setMemory(increasedMemory);
    }
}
