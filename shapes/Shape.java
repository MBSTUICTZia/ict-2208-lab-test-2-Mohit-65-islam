package shapes;

public abstract class Shape {

    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        String fillStatus;

        if (filled) {
            fillStatus = "Yes";
        } else {
            fillStatus = "No";
        }

        return "Color : " + color + "\n" +
               "Filled: " + fillStatus;
    }
}