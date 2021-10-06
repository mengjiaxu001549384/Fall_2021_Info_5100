package Q1Shape;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(int side) {
        this.width = side;
        this.height = side;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, String color, int width, int height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return this.getWidth() * this.getHeight();
    }

    @Override
    public int getPerimeter() {
        return (this.getWidth() + this.getHeight()) * 2;
    }
}
