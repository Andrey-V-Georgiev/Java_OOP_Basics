package _02_DefiningClassesEX._01_DefineClassPerson;

public class Person {
    private String name;
    private int age;

    public Person(String s, String d, int i){
    }

    public Person(String firstName, String name, int age, double salary){
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
