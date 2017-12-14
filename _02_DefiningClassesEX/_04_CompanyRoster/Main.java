package _02_DefiningClassesEX._04_CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static HashMap<String, List<Employee>> employees = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = bf.readLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];
            Employee newEmployee = new Employee();
            int tokensCount = tokens.length;
            switch(tokensCount){
                case 4:
                    newEmployee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    if(tokens[4].contains("@")){
                        String email = tokens[4];
                        newEmployee = new Employee(name, salary, position, department, email);
                    }else{
                        int age = Integer.parseInt(tokens[4]);
                        newEmployee = new Employee(name, salary, position, department, age);
                    }
                    break;
                case 6:
                    String email = tokens[4];
                    int age = Integer.parseInt(tokens[5]);
                    newEmployee = new Employee(name, salary, position, department, email, age);
                    break;
            }
            if(employees.containsKey(department)){
                employees.get(department).add(newEmployee);
            } else {
               employees.put(department, new ArrayList<>(Arrays.asList(newEmployee)));
            }
        }
        printResults();
    }

    private static void printResults() {
       employees.entrySet().stream().sorted((a,b)-> Double.compare(
               b.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble(),
               a.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble())
       ).limit(1).forEach(x->{
           System.out.printf("Highest Average Salary: %s%n", x.getKey());
           x.getValue().stream()
                   .sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()))
                   .forEach(e-> System.out.printf("%s %.2f %s %d%n",e.getName(),e.getSalary(),e.getEmail(),e.getAge()));
       });
    }
}
