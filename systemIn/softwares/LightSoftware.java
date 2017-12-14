package systemIn.softwares;

public class LightSoftware extends SoftwareComponent {
    public LightSoftware(String name, String type, int capacity, int memory) {
        super(name, capacity, memory);
        super.setType("LightSoftware");
    }

    @Override
    public void setCapacityConsumption(int capacity) {
        int increasedCapacityConsumption = capacity + ((capacity * 50) / 100);
        super.setCapacityConsumption(increasedCapacityConsumption);
    }

    @Override
    public void setMemoryConsumption(int memory){
        int decreasedMemoryConsumption = memory - ((memory * 50) / 100);
        super.setMemoryConsumption(decreasedMemoryConsumption);
    }
}
