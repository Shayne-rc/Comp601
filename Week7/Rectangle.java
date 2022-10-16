package Week7;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(String colour, double height, double width) {
        super(colour);
        this.setColour(colour);
        this.setHeight(height);
        this.setWidth(width);
    }

    @Override public String getShapeType() {
        return "I'm a Rectangle";
    }

    public double getPerimeter() {
        return (height + width) * 2 ;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
}
