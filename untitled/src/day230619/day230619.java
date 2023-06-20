package day230619;

public class day230619 {
//챕터 7
    //7-8
    // 접근제어자 접근범위가 넓은 것에서 좁은 것의 순 나열
    // public -> protected -> default -> private   protected는 같은 패키지네 자손클래스도 접근이 가능해서

    //7-9
    // 제어자 final은 메서드는 오버라이딩을 할수없다.
    // final은 재정의(수정) 변경 불기

    //7-12
    //접근제어자는 지역변수에서 사용 할 수 없다.
    // 이유 : 메서드나 생성자에서 사용되는데 해당영역에서만 사용되고 기능이 끝나면 사라진다.

    //7-13
    //Math클래스의 생성자는 접근제어자가 private이다. 그이유는?
    // 모든 메서드가 static메서드이기 때문 // 인스턴스변수가 존재하지 않는다.
//Math.
    //7-15 ★
    // e
    //조상타입으로는 가능

    //7-16
    // instance of연산자는 객체의 클래스 또는 해당 클래스의 하위 클래스에 대해 true 또는 false를 반환합니다.

    //7-17
    abstract class Unit{
        int    x,   y;                   //   현재   위치
        void move(int x, int y) {   /*   지정된   위치로   이동   */ }
        void stop(){   /*   현재   위치에   정지   */ }
    }
    class Marine extends Unit {
        void stimPack() {   /*   스팀팩을   사용한다.*/}
    }

    class Tank extends Unit {

        void changeMode() {   /*   공격모드를   변환한다.   */}
    }

    class Dropship extends Unit  {

        void load(){   /*   선택된   대상을   태운다.*/ }

        void unload() {   /*   선택된   대상을   내린다.*/ }
    }

    //7-21
    // null, 인터페이스를 리턴 메개변수로함


    //7-24
    // e . 패키지 연결은 없음

}
