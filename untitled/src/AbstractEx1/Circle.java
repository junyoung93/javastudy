package AbstractEx1;

class Circle extends Shape{
    private double radius;

    public Circle(double r){
        this.radius=radius;
    }

    @Override
    double calculateArea() {

        return Math.PI * radius *radius;
    }

    @Override
    double calculatePerimeter() {

        return 2 * Math.PI * radius;
    }
}
