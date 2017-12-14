package _06_InheritanceEX._06_Animals;

class Dog extends Animal{
    public Dog(String type, String name, String age, String gender) throws Exception {
        super(type, name, age, gender);
    }

    @Override
    public void produceSound(){
        System.out.println("BauBau");
    }
}
