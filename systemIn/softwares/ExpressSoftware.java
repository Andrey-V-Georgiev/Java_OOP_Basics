package systemIn.softwares;

public class ExpressSoftware extends SoftwareComponent {
    public ExpressSoftware(String name, String type, int capacity, int memory) {
        super(name, capacity, memory);
        super.setType("ExpressSoftware");
    }

    @Override
    public void setMemoryConsumption(int memoryConsumption){
        int doubleMemoryConsumption = memoryConsumption * 2;
        super.setMemoryConsumption(doubleMemoryConsumption);
    }
}
