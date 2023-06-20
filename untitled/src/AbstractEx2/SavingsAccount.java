package AbstractEx2;

class SavingsAccount extends  BankAccount{

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println(" 입금 금액 " + amount + " 성공. 현재금액은 : " + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() >= amount){
            setBalance(getBalance() - amount);
            System.out.println("인출금액 : " + amount + "성공. 현재 잔액 : " + getBalance());
        } else {
            System.out.println("인출 실패");
        }
    }
}
