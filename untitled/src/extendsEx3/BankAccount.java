package extendsEx3;


//★★★★★★★★★★★★★★★★★★★★★★ 은행관련★★★★★★★★★★★★★★★★★★★★★★★

//부모클래스
public class BankAccount {

    //1 필드만들기

    private String accountNumber;
    private double balance;


    //2. 생성자 만들기
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // 3. 예금메서드 만들기
    public void deposit(double amount){
        balance += amount;
    }

    // 3. 출금메서드 만들기
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        } else {
            System.out.println("통장에 돈 없어요");
        }
    }

    // 4. 통장 불러오기 메서드 만들기
    public double getBalance(){
        return balance;
    }


}
