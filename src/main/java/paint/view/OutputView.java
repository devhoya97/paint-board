package paint.view;

public class OutputView {
    public static void printPaintBoard(char[][] board) {
        StringBuilder sb = new StringBuilder();
        for (char[] row : board) {
            for (char point : row) {
                sb.append(point);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
