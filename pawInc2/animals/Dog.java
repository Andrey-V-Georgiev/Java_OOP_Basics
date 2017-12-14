package pawInc2.animals;

public class Dog extends Animal {
    private int learnedCommands;

    public Dog(String name, int age, int learnedCommands) {
        super(name, age);
        this.setLearnedCommands(learnedCommands);
    }

    public int getLearnedCommands() {
        return this.learnedCommands;
    }

    protected void setLearnedCommands(int learnedCommands) {
        this.learnedCommands = learnedCommands;
    }

}
