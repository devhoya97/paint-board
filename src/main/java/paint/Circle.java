package paint;

public class Circle implements Shape {
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

    @Override
    public void paint(char[][] board, char figure) {
        Point upperLeft = new Point((origin.getX() - radius), (origin.getY() - radius));

        paintCircleFirstQuadrant(board, figure, new Point(upperLeft.getX() + radius, upperLeft.getY()));
        paintCircleSecondQuadrant(board, figure, upperLeft);
        paintCircleThirdQuadrant(board, figure, new Point(upperLeft.getX(), upperLeft.getY() + radius));
        paintCircleFourthQuadrant(board, figure, new Point(upperLeft.getX() + radius, upperLeft.getY() + radius));
    }

    private void paintCircleFirstQuadrant(char[][] board, char figure, Point upperLeft) {
        for (int yIndex = upperLeft.getY(); yIndex < upperLeft.getY() + radius; yIndex++) {
            for (int xIndex = upperLeft.getX(); xIndex < upperLeft.getX() + radius; xIndex++) {
                if (isInRange(xIndex, yIndex, origin.getX(), origin.getY() - 1)) {
                    board[yIndex][xIndex] = figure;
                }
            }
        }
    }

    private void paintCircleSecondQuadrant(char[][] board, char figure, Point upperLeft) {
        for (int yIndex = upperLeft.getY(); yIndex < upperLeft.getY() + radius; yIndex++) {
            for (int xIndex = upperLeft.getX(); xIndex < upperLeft.getX() + radius; xIndex++) {
                if (isInRange(xIndex, yIndex, origin.getX() - 1, origin.getY() - 1)) {
                    board[yIndex][xIndex] = figure;
                }
            }
        }
    }

    private void paintCircleThirdQuadrant(char[][] board, char figure, Point upperLeft) {
        for (int yIndex = upperLeft.getY(); yIndex < upperLeft.getY() + radius; yIndex++) {
            for (int xIndex = upperLeft.getX(); xIndex < upperLeft.getX() + radius; xIndex++) {
                if (isInRange(xIndex, yIndex, origin.getX() - 1, origin.getY())) {
                    board[yIndex][xIndex] = figure;
                }
            }
        }
    }

    private void paintCircleFourthQuadrant(char[][] board, char figure, Point upperLeft) {
        for (int yIndex = upperLeft.getY(); yIndex < upperLeft.getY() + radius; yIndex++) {
            for (int xIndex = upperLeft.getX(); xIndex < upperLeft.getX() + radius; xIndex++) {
                if (isInRange(xIndex, yIndex, origin.getX(), origin.getY())) {
                    board[yIndex][xIndex] = figure;
                }
            }
        }
    }

    private boolean isInRange(int xIndex, int yIndex, int originXIndex, int originYIndex) {
        int range = radius - 1;
        int additionalRange = (radius / 2) - 1;

        int distance = Math.abs(originXIndex - xIndex) + Math.abs(originYIndex - yIndex);

        return distance <= (range + additionalRange);
    }
}
