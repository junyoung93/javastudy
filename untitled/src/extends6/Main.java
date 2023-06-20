package extends6;

public class Main {
    public static void main(String[] args) {
        double r = 8.0;
//
        Circle circle = new Circle(r);
        System.out.println("원의 반지름 = " + r);
        System.out.println("원의 둘레 = " + circle.getPerimeter());
        System.out.println("원의 면적 = " + circle.getArea());
    }
}
