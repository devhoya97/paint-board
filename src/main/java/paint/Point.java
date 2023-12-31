package paint;

import java.util.List;

public class Point {
    public static final int MIN_X = 1;
    public static final int MAX_X = 79;
    public static final int MIN_Y = 1;
    public static final int MAX_Y = 29;
    private final int x;
    private final int y;

    public Point(int x, int y) {
        validate(x, y);
        this.x = x;
        this.y = y;
    }

    private void validate(int x, int y) {
        if ((x < MIN_X) || (x > MAX_X) || (y < MIN_Y) || (y > MAX_Y)) {
            throw new IllegalArgumentException();
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
