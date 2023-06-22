package day230622;

// 실행결과를 적으시오!!
class Exercise8_7 {
    static void method(boolean b) {
        try {
            System.out.println(1);
            if (b) System.exit(0);
            System.out.println(2);
        } catch (RuntimeException r) {
            System.out.println(3);
            return;
        } catch (Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }

    public static void main(String[] args) {
        method(true);
        method(false);
    }   //   main
}
// (1)
// true로 b에 들어와서 시스템이 종료
