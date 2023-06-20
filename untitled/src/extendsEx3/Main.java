package extendsEx3;

public class Main {
    public static void main(String[] args) {
        System.out.println("초기 잔액이 $500인 은행 계좌 객체(A/c No. BA1234)를 생성합니다.");

        //1. 은행 계좌 개설
        BankAccount BA1234 = new BankAccount("BA1234", 500);

        //2. 계좌에 입금 후 통장잔액확인
        System.out.println("BA1234 계정에 $1000 입금");

        BA1234.deposit(1500);
        System.out.println("$1000 입금 후 새 잔액 : " + BA1234.getBalance());

        // 3.
        System.out.println("BA1234 계정에서 $600 인출");
        BA1234.withdraw(600);
        System.out.println("$600 인출 후 새 잔액 : "+ BA1234.getBalance());


        // 4.안전계좌 생성
        System.out.println("초기 잔액이 $450인 SavingAccount 객체(A/c No. SA1234)를 생성합니다.");
        SavingsAccount SA1234 = new SavingsAccount("SA1234",450);
//        System.out.println(SA1234.getBalance());

//        //인출시도
        SA1234.withdraw(0);
        System.out.println("$300 인출 후 새 잔액 : "+ SA1234.getBalance());


        System.out.println("초기 잔액 $300인 SavingsAccount 개체(A/c No. SA1000) 생성: ");
        SavingsAccount SA1000 = new SavingsAccount("SA1000",300);
//        System.out.println(SA1000.getBalance());

        SA1000.withdraw(250);
        System.out.println("$250 인출 시도 후 잔액 : " + SA1000.getBalance());






    }
}
