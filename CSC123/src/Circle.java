//Francisco Rodriguez (frodriguez127@toromail.csudh.edu)

public class Circle {
    
    private String label;
    private double radius;
    private final double PI = 3.14159; 

    // constructor
    public Circle(String label, double radius) {
        this.label = label;
        this.radius = radius;
    }

    // methods
    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    
    public String toString() {
        return label + "\nRadius : " + radius + "\nArea : " + getArea() + "\nCircumference : " + getCircumference();
    }
}
