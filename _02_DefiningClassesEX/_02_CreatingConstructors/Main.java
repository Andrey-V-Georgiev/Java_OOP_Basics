package _02_DefiningClassesEX._02_CreatingConstructors;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        int age = Integer.parseInt(bf.readLine());

        Person one = new Person();
        Person two = new Person(age);
        Person three = new Person(name, age);


        System.out.printf("%s %s%n", one.getName(), one.getAge());
        System.out.printf("%s %s%n", two.getName(), two.getAge());
        System.out.printf("%s %s%n", three.getName(), three.getAge());

    }
}
