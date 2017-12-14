package _02_DefiningClassesEX._10_EncapsulacionLab._02_SalaryIncrease;

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
            String[] tokens = bf.readLine().split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            double salary = Double.parseDouble(tokens[3]);
            people.add(new Person(firstName, lastName, age, salary));
        }

        int bonus = Integer.parseInt(bf.readLine());
        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
}
