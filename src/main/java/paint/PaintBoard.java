package paint;

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

    public char[][] getBoard() {
        return board;
    }
}
