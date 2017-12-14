package _02_DefiningClassesEX._10_EncapsulacionLab._01_SortByNameAndAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = bf.readLine().split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            people.add(new Person(firstName, lastName, age));
        }
        people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .sorted((f1,f2)-> f1.getFirstName().compareTo(f2.getFirstName()))
                .forEach(p-> System.out.print(p));

    }
}
