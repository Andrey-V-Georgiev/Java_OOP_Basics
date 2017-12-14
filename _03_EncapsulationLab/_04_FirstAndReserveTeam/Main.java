package _03_EncapsulationLab._04_FirstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Team Marek = new Team("Marek");
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = bf.readLine().split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            double salary = Double.parseDouble(tokens[3]);
            Person newPerson = new Person(firstName, lastName, age, salary);

            Marek.addPlayer(newPerson);
        }
        System.out.printf("First team have %d players%n", Marek.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n",Marek.getReserveTeam().size());
    }
}
