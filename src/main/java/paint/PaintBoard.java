package paint;

public class PaintBoard {
    private static final int MAX_X = 80;
    private static final int MAX_Y = 30;
    private static final char VERTEX = '+';
    private static final char BOUNDARY_X = '-';
    private static final char BOUNDARY_Y = '|';
    private static final char FIGURE = '*';
    private static final char EMPTY = ' ';


    private final char[][] board = new char[MAX_X][MAX_Y];

    public PaintBoard() {
        initializeToEmpty();
    }

    private void initializeToEmpty() {
        for (int xIndex = 0; xIndex < MAX_X; xIndex++) {
            for (int yIndex = 0; yIndex < MAX_Y; yIndex++) {
                board[xIndex][yIndex] = EMPTY;
            }
        }
    }

    public char[][] getBoard() {
        return board;
    }
}
