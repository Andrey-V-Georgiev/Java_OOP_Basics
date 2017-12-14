package _06_InheritanceEX._06_Animals;

class Kitten extends Cat{

    public Kitten(String type, String name, String age, String gender) throws Exception {
        super(type, name, age, gender);
    }

    @Override
    public void produceSound(){
        System.out.println("Miau");
    }
}
