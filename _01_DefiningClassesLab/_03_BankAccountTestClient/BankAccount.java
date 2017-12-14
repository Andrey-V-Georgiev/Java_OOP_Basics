package _01_DefiningClassesLab._03_BankAccountTestClient;

class BankAccount {
    private int id;
    private double balance;

    public BankAccount(int id) {
        this.id = id;
        this.balance = 0.0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount >= 0) {
            this.balance += depositAmount;
        }
    }

    public void withdraw(double withdrawAmount) {
       if(this.balance - withdrawAmount < 0){
           System.out.println("Insufficient balance");
       } else {
           this.balance -= withdrawAmount;
       }
    }

    @Override
    public String toString() {
        return String.format("Account ID%d, balance %.2f%n",this.id, this.balance);
    }
}
