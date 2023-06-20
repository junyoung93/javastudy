package AbstractEx1;

public class Main {
    public static void main(String[] args) {
        double r = 4.0;

        Circle circle = new Circle(r);
        double ts1 = 3.0 , ts2 = 4.0, ts3 = 5.0;

        Triangle triangle = new Triangle(ts1,ts2,ts3);
        System.out.println("원의 반지름 : " + r);
        System.out.println("원의 넓이 : " + circle.calculateArea() );
        System.out.println("원의 둘레 : " + circle.calculatePerimeter());
        System.out.println("삼각형의 넓이 : " + triangle.calculateArea());
        System.out.println("삼각형의 둘레 : " + triangle.calculatePerimeter());

    }

}
