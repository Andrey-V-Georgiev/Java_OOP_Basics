package _02_DefiningClassesEX._02_CreatingConstructors;

class Person {
    private String name = "No name";
    private int age = 1;

    public Person(){
    }

    public Person(int age){
        this.age = age;
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

}
