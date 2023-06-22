package day230622;

///실행결과를 적으시오!
class Exercise8_6 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(5);
        }
    }

    static void method1() {
        try {
            method2();
            System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
        System.out.println(4);
    }       //   method1()

    static void method2() {
        throw new NullPointerException();
    }
}

/// (3) -> (5)
///예외가 발생하면 해당 예외를 처리하는 catch 블록으로 이동하고, 그 이후의 코드는 실행되지 않는다