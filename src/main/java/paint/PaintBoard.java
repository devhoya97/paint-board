package paint;

import java.util.List;

public class PaintBoard {
    private static final int MAX_X = 80;
    private static final int MAX_Y = 30;
    private static final char VERTEX = '+';
    private static final char BOUNDARY_X = '-';
    private static final char BOUNDARY_Y = '|';
    private static final char FIGURE = '*';
    private static final char EMPTY = ' ';


    private final char[][] board = new char[MAX_Y][MAX_X];

    public PaintBoard() {
        initializeToEmpty();
        fillVertex();
        fillXBoundary();
        fillYBoundary();
    }

    private void initializeToEmpty() {
        for (int yIndex = 0; yIndex < MAX_Y; yIndex++) {
            for (int xIndex = 0; xIndex < MAX_X; xIndex++) {
                board[yIndex][xIndex] = EMPTY;
            }
        }
    }

    private void fillVertex() {
        board[0][0] = VERTEX;
        board[MAX_Y - 1][0] = VERTEX;
        board[0][MAX_X -1] = VERTEX;
        board[MAX_Y - 1][MAX_X -1] = VERTEX;
    }

    private void fillXBoundary() {
        List<Integer> yIndexesOfXBoundary = List.of(0, MAX_Y - 1);
        for (int yIndex : yIndexesOfXBoundary) {
            for (int xIndex = 1; xIndex < MAX_X - 1; xIndex++) {
                board[yIndex][xIndex] = BOUNDARY_X;
            }
        }
    }

    private void fillYBoundary() {
        List<Integer> xIndexesOfXBoundary = List.of(0, MAX_X - 1);
        for (int xIndex : xIndexesOfXBoundary) {
            for (int yIndex = 1; yIndex < MAX_Y - 1; yIndex++) {
                board[yIndex][xIndex] = BOUNDARY_Y;
            }
        }
    }

    public void paintRectangle(Point point1, Point point2) {
        for (int yIndex = point1.getY(); yIndex <= point2.getY(); yIndex++) {
            for (int xIndex = point1.getX(); xIndex <= point2.getX(); xIndex++) {
                board[yIndex][xIndex] = FIGURE;
            }
        }
    }

    public void paintCircle(Circle circle) {
        Point origin = circle.getOrigin();
        int radius = circle.getRadius();

        Point upperLeft = new Point((origin.getX() - circle.getRadius()), (origin.getY() - circle.getRadius()));

        paintCircleFirstQuadrant(new Point(upperLeft.getX() + radius, upperLeft.getY()), circle);
        paintCircleSecondQuadrant(upperLeft, circle);
        paintCircleThirdQuadrant(new Point(upperLeft.getX(), upperLeft.getY() + radius), circle);
        paintCircleFourthQuadrant(new Point(upperLeft.getX() + radius, upperLeft.getY() + radius), circle);
    }

    private void paintCircleFirstQuadrant(Point upperLeft, Circle circle) {
        for (int yIndex = upperLeft.getY(); yIndex < upperLeft.getY() + circle.getRadius(); yIndex++) {
            for (int xIndex = upperLeft.getX(); xIndex < upperLeft.getX() + circle.getRadius(); xIndex++) {
                if (circle.isInFirstQuadrant(xIndex, yIndex)) {
                    board[yIndex][xIndex] = FIGURE;
                }
            }
        }
    }

    private void paintCircleSecondQuadrant(Point upperLeft, Circle circle) {
        for (int yIndex = upperLeft.getY(); yIndex < upperLeft.getY() + circle.getRadius(); yIndex++) {
            for (int xIndex = upperLeft.getX(); xIndex < upperLeft.getX() + circle.getRadius(); xIndex++) {
                if (circle.isInSecondQuadrant(xIndex, yIndex)) {
                    board[yIndex][xIndex] = FIGURE;
                }
            }
        }
    }

    private void paintCircleThirdQuadrant(Point upperLeft, Circle circle) {
        for (int yIndex = upperLeft.getY(); yIndex < upperLeft.getY() + circle.getRadius(); yIndex++) {
            for (int xIndex = upperLeft.getX(); xIndex < upperLeft.getX() + circle.getRadius(); xIndex++) {
                if (circle.isInThirdQuadrant(xIndex, yIndex)) {
                    board[yIndex][xIndex] = FIGURE;
                }
            }
        }
    }

    private void paintCircleFourthQuadrant(Point upperLeft, Circle circle) {
        for (int yIndex = upperLeft.getY(); yIndex < upperLeft.getY() + circle.getRadius(); yIndex++) {
            for (int xIndex = upperLeft.getX(); xIndex < upperLeft.getX() + circle.getRadius(); xIndex++) {
                if (circle.isInFourthQuadrant(xIndex, yIndex)) {
                    board[yIndex][xIndex] = FIGURE;
                }
            }
        }
    }

    public char[][] getBoard() {
        return board;
    }
}
