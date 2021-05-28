package day9.Task2;

public class Triangle extends Figure {
    private double lengthAB;
    private double lengthBC;
    private double lengthAC;

    @Override
    public double area() {
        double s = (lengthAB + lengthBC + lengthAC) / 2;
        return Math.sqrt(s * (s - lengthAB) * (s - lengthBC) * (s - lengthAC));
    }

    @Override
    public double perimeter() {
        return lengthAB + lengthBC + lengthAC;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public Triangle(String color, int lengthAB, int lengthBC, int lengthAC) {
        super(color);
        this.lengthAB = lengthAB;
        this.lengthBC = lengthBC;
        this.lengthAC = lengthAC;
    }
}



