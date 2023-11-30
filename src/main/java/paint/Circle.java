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
        if (((origin.getX() - radius) < MIN_X)
                || ((origin.getX() + radius) > MAX_X)
                || ((origin.getY() - radius) < MIN_Y)
                || ((origin.getY() + radius) > MAX_Y)) {
            throw new IllegalArgumentException();
        }
    }

    public boolean isInUpperLeft(int xIndex, int yIndex) {
        int originXIndex = origin.getX() - 1;
        int originYIndex = origin.getY() - 1;

        if ((xIndex > originXIndex) || (yIndex > originYIndex)) {
            return false;
        }

        return isInRange(xIndex, yIndex, originXIndex, originYIndex);
    }

    public boolean isInUpperRight(int xIndex, int yIndex) {
        int originXIndex = origin.getX() - 1;
        int originYIndex = origin.getY();

        if ((xIndex < originXIndex) || (yIndex > originYIndex)) {
            return false;
        }

        return isInRange(xIndex, yIndex, originXIndex, originYIndex);
    }

    public boolean isInLowerLeft(int xIndex, int yIndex) {
        int originXIndex = origin.getX() - 1;
        int originYIndex = origin.getY();

        if ((xIndex > originXIndex) || (yIndex < originYIndex)) {
            return false;
        }

        return isInRange(xIndex, yIndex, originXIndex, originYIndex);
    }

    public boolean isInLowerRight(int xIndex, int yIndex) {
        int originXIndex = origin.getX();
        int originYIndex = origin.getY();

        if ((xIndex < originXIndex) || (yIndex < originYIndex)) {
            return false;
        }

        return isInRange(xIndex, yIndex, originXIndex, originYIndex);
    }

    private boolean isInRange(int xIndex, int yIndex, int originXIndex, int originYIndex) {
        int range = radius - 1;
        int additionalRange = (radius / 2) - 1;

        int distance = Math.abs(originXIndex - xIndex) + Math.abs(originYIndex - yIndex);

        return distance <= (range + additionalRange);
    }

    public Point getOrigin() {
        return origin;
    }

    public int getRadius() {
        return radius;
    }
}
