package paint;

import paint.view.OutputView;

public class ApplicationCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(10, 10), 2);
        System.out.println(circle.isInUpperLeft(9, 9) + " expected true");
        System.out.println(circle.isInUpperLeft(8, 9) + " expected true");
        System.out.println(circle.isInUpperLeft(8, 8) + " expected false");
    }
}
