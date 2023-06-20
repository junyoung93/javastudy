package extendsEx3;


//자식클래스 extends를 받는다

// SavingAccount = 계좌보호
public class SavingsAccount extends BankAccount {

    //1. 매개변수가 있는 생성자를 생성 // super를 써서 부모에 있는 필드를 가져다 쓴다
    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber,balance);

    }

    // 2. 부모의 메서드를 오버라이드해서 자식클래스에서 입맞에 맞게 맞춘다.
    @Override
    public void withdraw(double amount) {
        if(getBalance() - amount < 100){
            System.out.println("최소 잔액 100 필요");
        } else{
            super.withdraw(amount);
        }
    }
}
