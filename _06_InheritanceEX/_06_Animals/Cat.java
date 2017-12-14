package _06_InheritanceEX._06_Animals;

class Cat extends Animal{
    public Cat(String type, String name, String age, String gender) throws Exception {
        super(type, name, age, gender);
    }

    @Override
    public void produceSound(){
        System.out.println("MiauMiau");
    }
}
