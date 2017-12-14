package _06_InheritanceEX._06_Animals;

class Tomcat extends Cat {

    public Tomcat(String type, String name, String age, String gender) throws Exception {
        super(type, name, age, gender);
    }

    @Override
    public void produceSound(){
        System.out.println("Give me one million b***h");
    }
}
