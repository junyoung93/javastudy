package day230628;

public class day230628 {

    /*
    클래스 Box가 다음과 같이 정의되어 있을 때, 다음 중 오류가 발생하는 문장은?
    경고가 발생하는 문장은?
     */
/*
    a.    Box<Object>    b   =    new    Box<String>();
    b.    Box<Object>    b   =    (Object)new   Box<String>();
    c.    new    Box<String>().setItem(new   Object());
    d.    new    Box<String>().setItem("ABC");
답 : a, b , c
a b c 는 타입불일치 // b는 경고
d 는 string 이라 가능
 */
    class Box<T> {
        T item;

        void setItem(T item) {
            this.item = item;
        }

        T getItem() {
            return item;
        }
    }
}
