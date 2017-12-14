package _01_DefiningClassesLab._05_StaticIdAndInterestRate;

class BankAccount {
    private final static double DEFAULT_INTEREST = 0.02;
    private static double rate = DEFAULT_INTEREST;
    private static int bankAccountCount;
    private int id;
    private double balance;

    public BankAccount(){
        this.id = ++bankAccountCount;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setId(int id){
        this.id = id;
    }

    public static void setInterest(double interest){
        rate = interest;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public double getInterest(int years){
        return this.balance * rate * years;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    @Override
    public String toString(){
        return "ID" + this.id;
    }

}
