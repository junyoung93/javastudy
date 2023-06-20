package day230619;

class Outer1 {
    class Inner {
        int iv = 100;
    }
}

class Exercise7_25 {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Outer1.Inner ii = outer.new Inner();
        System.out.println(ii.iv);
    }
}
//내부 클래스는 인스턴스를 생성하기 위해선 외부클래스를 먼저 생성해야한다.
//내부의 클래스를 하나의 인스턴스로 생각하자
