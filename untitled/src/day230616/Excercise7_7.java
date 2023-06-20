package day230616;

// 코드를 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
class Parent {
    int x = 100;
    // 3번
    Parent() {
        this(200);
    }
    // 4번
    Parent(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 3000;
    int y = 4000;


    // 1번
    Child() {
        this(7000,2000);
    }
    // 2번
    Child(int x,int y) {
        this.x = x;
        this.y = y;
    }
}

class Exercise7_7 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("x=" + c.getX());
    }
}