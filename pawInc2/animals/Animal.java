package pawInc2.animals;

public abstract class Animal {
    private String name;
    private int age;
    private boolean cleansingStatus;

    protected Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }


    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public boolean getCleansingStatus() {
        return this.cleansingStatus;
    }

    protected void setCleansingStatus(boolean cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }
}
