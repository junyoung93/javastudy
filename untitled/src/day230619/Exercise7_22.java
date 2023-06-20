package day230619;

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();       //    도형의 면적을 계산해서 반환하는 메서드

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

class Circle extends Shape{
    private double r;

    public Circle(double r) {

        this.r = r;
    }

    public Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    @Override //원의 넓이
    double calcArea() {
        return Math.PI *r*r;
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public boolean isSquare(){
        return width*height !=0 && width==height;
    }

    @Override
    double calcArea() {
        return width * height;
    }
}