package _01_DefiningClassesLab._05_StaticIdAndInterestRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    private static HashMap<Integer, BankAccount> accounts = new HashMap<>();
    private static int id = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String command = bf.readLine();

        while (!"End".equals(command)) {
            String[] tokens = command.split("\\s+");
            processCommand(tokens);
            command = bf.readLine();
        }
    }

    private static void processCommand(String[] tokens) {
        String action = tokens[0];
        switch (action) {
            case "Create":
                accounts.put(++id, new BankAccount());
                accounts.get(id).setId(id);
                System.out.printf("Account %s created%n", accounts.get(id));
                break;

            case "Deposit":
                int depositId = Integer.valueOf(tokens[1]);
                if (accounts.containsKey(depositId)) {
                    accounts.get(depositId).deposit(Double.valueOf(tokens[2]));
                    double depositAmount = Double.valueOf(tokens[2]);
                    System.out.printf("Deposited %d to %s%n", (int)depositAmount, accounts.get(depositId));
                } else {
                    System.out.println("Account does not exist");
                }
                break;

            case "SetInterest":
                double interestAmount = Double.valueOf(tokens[1]);
                BankAccount.setInterest(interestAmount);
                break;

            case "GetInterest":
                depositId = Integer.valueOf(tokens[1]);
                if (accounts.containsKey(depositId)) {
                    int years = Integer.valueOf(tokens[2]);
                    System.out.printf("%.2f%n", accounts.get(depositId).getInterest(years));
                } else {
                    System.out.println("Account does not exist");
                }
                break;
        }
    }
}
