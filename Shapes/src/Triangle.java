public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        sideA = 1.0;
        sideB = 1.0;
        sideC = 1.0;
    }

    public Triangle(double side) {
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getArea() {
        return 0.25 * Math.sqrt(sideA + sideB + sideC) * Math.sqrt(sideA * -1 + sideB + sideC) * Math.sqrt(sideA - sideB + sideC) * Math.sqrt(sideA + sideB - sideC);

    }

    public double getPerimeter(){
        return sideA+sideB+sideC;
    }

    @Override
    public String toString() {
        return "A triangle with sides of " + sideA + ", " +sideB+", "+sideC+" with a subclass of " + super.toString().toLowerCase();
    }
}
