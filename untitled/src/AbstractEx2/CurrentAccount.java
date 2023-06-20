package AbstractEx2;

class CurrentAccount extends BankAccount{

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println(" 입금 금액 : " + amount + "현재 금액 : " + getBalance());

    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() >= amount){
            setBalance(getBalance() - amount);
            System.out.println("인출 금액 : " + amount + "성공. 현재 금액 : " + getBalance());
        } else {
            System.out.println("인출 실패");
        }
    }
}
