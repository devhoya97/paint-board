package paint;

public class Rectangle implements Shape {

    private final Point upperLeft;
    private final Point lowerRight;

    public Rectangle(Point upperLeft, Point lowerRight) {
        validate(upperLeft, lowerRight);
        this.upperLeft = upperLeft;
        this.lowerRight = lowerRight;
    }

    private void validate(Point upperLeft, Point lowerRight) {
        if (upperLeft.getX() >= lowerRight.getX() ||
                upperLeft.getY() >= lowerRight.getY()) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void paint(char[][] board, char figure) {
        for (int yIndex = upperLeft.getY(); yIndex < lowerRight.getY(); yIndex++) {
            for (int xIndex = upperLeft.getX(); xIndex < lowerRight.getX(); xIndex++) {
                board[yIndex][xIndex] = figure;
            }
        }
    }
}
