package paint;

public class ApplicationCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(10, 10), 5);
        System.out.println(circle.isInCircle(9,9));
    }
}
