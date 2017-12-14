package _02_DefiningClassesEX._03_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String input = bf.readLine();
            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);
            Person newPerson = new Person(name, age);
            people.add(newPerson);
        }
        people.stream().filter(x->x.getAge()>30)
                .sorted((a,b)->a.getName().compareTo(b.getName()))
                .forEach(x-> System.out.printf("%s - %d%n", x.getName(), x.getAge()));
    }
}
