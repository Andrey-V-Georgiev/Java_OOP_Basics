package _01_DefiningClassesLab._05_StaticIdAndInterestRate;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;
    private List<BankAccount> bankAccounts;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.bankAccounts = new ArrayList<>();
    }

    public Person(String name, int age, List<BankAccount> accounts) {
        this.name = name;
        this.age = age;
        this.bankAccounts = accounts;
    }

    public double getBalance(){
        double sum = 0.0;
        for (BankAccount account : bankAccounts) {
            sum += account.getBalance();
        }
        return sum;
    }
}
