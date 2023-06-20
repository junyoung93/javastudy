package extends6;

public class Circle  extends Shape{
    private double radious;

     public Circle(double radious){
         this.radious = radious;
     }

     //원의 둘레 공식 == 2 파이 r
    @Override
    public double getPerimeter() {
         return 2 * Math.PI * radious;
    }

    // 원의 면적 == 파이 r 제곱
    @Override
    public double getArea() {
         return Math.PI * radious * radious;
    }
}
