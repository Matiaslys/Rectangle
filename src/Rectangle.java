public class Rectangle {
    double width;
    double height;
    Rectangle() {
        width = 1;
        height = 1;
    }
    Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return width * 2 + height * 2;
    }

    public static void main(String[] args) {
        Rectangle rectangle0 = new Rectangle();
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println(rectangle0.height + " " + rectangle0.width + " " + rectangle0.getArea() + " " + rectangle0.getPerimeter());
        System.out.println(rectangle1.height + " " + rectangle1.width + " " + rectangle1.getArea() + " " + rectangle1.getPerimeter());
        System.out.println(rectangle2.height + " " + rectangle2.width + " " + rectangle2.getArea() + " " + rectangle2.getPerimeter());
    }
}
