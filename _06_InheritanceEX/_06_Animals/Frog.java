package _06_InheritanceEX._06_Animals;

public class Frog extends Animal{
    public Frog(String type, String name, String age, String gender) throws Exception {
        super(type, name, age, gender);
    }

    @Override
    public void produceSound(){
        System.out.println("Frogggg");
    }
}
