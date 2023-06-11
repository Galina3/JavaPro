package homeWork2_06;

public class Triangle {

    private double sideA = 0;
    private double sideB = 0;
    private double sideC = 0;
    private boolean isCorrectTriangle = true;

    public Triangle(double sideA, double sideB, double sideC) {
        isCorrectTriangle = checkTriangleSides(sideA, sideB, sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private boolean checkTriangleSides(double sideA, double sideB, double sideC) {
        return (sideA < (sideB + sideC) && sideB < (sideA + sideC) && sideC < (sideA + sideB));

    }

    private double getPerimeter() {
        return sideA + sideB + sideC;
    }

    private double getSquare() {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        double result = halfPerimeter * (halfPerimeter - sideA) *
                (halfPerimeter - sideB) * (halfPerimeter - sideC);
        return Math.sqrt(result);

    }

    private String getTypeOfTriangle() {
        if (sideA == sideB && sideB == sideC) {
            return "Это равнобедренный треугольник";
        }
        if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "Это равносторонний треугольник";
        }
        return "Это разносторонний треугольник";

    }

    @Override
    public String toString() {
        return "Этот треугольник со сторонами : " + sideA + ", "
                + sideB + ", " + sideC + "\n" +
                (isCorrectTriangle ? "Периметр  = " + getPerimeter() + "\n"
                        + "Площадь = " + getSquare() + "\n"
                        + getTypeOfTriangle() : "Этот треугольник не может существовать");
    }


}
