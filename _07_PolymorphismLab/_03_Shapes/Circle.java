package _07_PolymorphismLab._03_Shapes;

class Circle extends Shape {
    private Double radius;
    private Double perimeter;
    private Double area;

    public Circle(Double radius) {
        this.setRadius(radius);
        this.calculatePerimeter();
        this.calculateArea();
    }
    public final Double getRadius() {
        return radius;
    }

    private void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    protected void calculatePerimeter() {
        this.perimeter = 2 * Math.PI * this.radius;
    }

    @Override
    protected void calculateArea() {
        this.area = Math.PI * (this.radius * this.radius);
    }
}
