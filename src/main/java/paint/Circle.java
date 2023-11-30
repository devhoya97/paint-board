package paint;

public class Circle {
    public static final int MIN_X = 1;
    public static final int MAX_X = 78;
    public static final int MIN_Y = 1;
    public static final int MAX_Y = 28;
    private final Point origin;
    private final int radius;

    public Circle(Point origin, int radius) {
        validate(origin, radius);
        this.origin = origin;
        this.radius = radius;
    }

    private void validate(Point origin, int radius) {
        if ((origin.getX() - radius < MIN_X) || (origin.getX() + radius > MAX_X)
                || (origin.getY() - radius < MIN_Y || origin.getY() + radius > MAX_Y)) {
            throw new IllegalArgumentException();
        }
    }
}
