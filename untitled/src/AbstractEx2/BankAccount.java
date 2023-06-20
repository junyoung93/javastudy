package AbstractEx2;

abstract class BankAccount {
    private String accountNumber;
    private  double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return  balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

}
