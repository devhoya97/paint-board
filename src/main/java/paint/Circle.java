package paint;

public class Circle {
    public static final int MIN_X = 1;
    public static final int MAX_X = 79;
    public static final int MIN_Y = 1;
    public static final int MAX_Y = 29;
    private final Point origin;
    private final int radius;

    public Circle(Point origin, int radius) {
        validate(origin, radius);
        this.origin = origin;
        this.radius = radius;
    }

    private void validate(Point origin, int radius) {
        if (((origin.getX() - radius) >= MIN_X)
                || ((origin.getX() + radius) <= MAX_X)
                || ((origin.getY() - radius) >= MIN_Y)
                || ((origin.getY() + radius) <= MAX_Y)) {
            throw new IllegalArgumentException();
        }
    }

    public boolean isInCircle(int x, int y) {
        double distanceSquare = Math.pow(x - origin.getX(), 2) + Math.pow(y - origin.getY(), 2);
        return Math.pow(radius, 2) >= distanceSquare;
    }

    public Point getOrigin() {
        return origin;
    }

    public int getRadius() {
        return radius;
    }
}
