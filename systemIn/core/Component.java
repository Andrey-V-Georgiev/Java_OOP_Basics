package systemIn.core;

public abstract class Component {
    private String name;
    private String type;

    protected Component(String name){
        this.setName(name);
    }

    public Component(String name, String type) {
        this.setName(name);
        this.setType(type);
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public abstract int getCapacity();

    public abstract int getMemory();
}
