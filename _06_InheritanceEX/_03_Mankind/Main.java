package _06_InheritanceEX._03_Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = bf.readLine().split("\\s+");
        String studentFirstName = firstLine[0];
        String studentLastName = firstLine[1];
        String facultyNumber = firstLine[2];

        String[] secondLine = bf.readLine().split("\\s+");
        String workerFirstName = secondLine[0];
        String workerLastName = secondLine[1];
        double weekSalary = Double.parseDouble(secondLine[2]);
        double workHoursPerDay = Double.parseDouble(secondLine[3]);
        try {
            Student student = new Student(studentFirstName, studentLastName, facultyNumber);
            Worker worker = new Worker(workerFirstName, workerLastName, weekSalary, workHoursPerDay);

            System.out.printf("First Name: %s%n", student.getFirstName());
            System.out.printf("Last Name: %s%n", student.getLastName());
            System.out.printf("number: %s%n", student.getFacultyNumber());
            System.out.printf("Name: %s%n", worker.getFirstName());
            System.out.printf("Last Name: %s%n", worker.getLastName());
            System.out.printf("Week Salary: %.2f%n", worker.getWeekSalary());
            System.out.printf("Hours per day: %.2f%n", worker.getWorkHoursPerDay());
            System.out.printf("Salary per hour: %.2f%n", worker.salaryPerHour());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }



    }
}
