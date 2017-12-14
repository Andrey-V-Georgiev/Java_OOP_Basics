package pawInc2.centers;


public abstract class Center {
    private String name;

    protected Center(String name) {
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

}
