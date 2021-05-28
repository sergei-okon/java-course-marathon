package day9.Task2;

public class Rectangle extends Figure {
    private double width;
    private double height;

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
}
