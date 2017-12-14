package _01_DefiningClassesLab._03_BankAccountTestClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static String[] tokens;
    static HashMap<Integer, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        tokens = bf.readLine().split("\\s+");
        while (!"End".equalsIgnoreCase(tokens[0])) {
            String action = tokens[0];
            switch (action) {
                case "Create":
                    executeCreate();
                    break;
                case "Deposit":
                    executeDeposit();
                    break;
                case "Withdraw":
                    executeWithdraw();
                    break;
                case "Print":
                    executePrint();
                    break;
                default:
                    break;
            }
            tokens = bf.readLine().split("\\s+");
        }
    }

    static void executePrint() {
        int id = Integer.valueOf(tokens[1]);
        if (accounts.containsKey(id)) {
            System.out.print(accounts.get(id));
        } else {
            System.out.println("Account does not exist");
        }
    }

    static void executeWithdraw() {
        int id = Integer.valueOf(tokens[1]);
        double withdrawAmount = Double.parseDouble(tokens[2]);
        if (accounts.containsKey(id)) {
            accounts.get(id).withdraw(withdrawAmount);
        } else {
            System.out.println("Account does not exist");
        }
    }

    static void executeDeposit() {
        int id = Integer.valueOf(tokens[1]);
        double depositAmount = Double.parseDouble(tokens[2]);
        if (accounts.containsKey(id)) {
            accounts.get(id).deposit(depositAmount);
        } else {
            System.out.println("Account does not exist");
        }
    }

    static void executeCreate() {
        int id = Integer.valueOf(tokens[1]);
        if (accounts.containsKey(id)) {
            System.out.println("Account already exists");
        } else {
            BankAccount account = new BankAccount(id);
            accounts.put(id, account);
        }
    }
}
