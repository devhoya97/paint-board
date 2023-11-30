package paint.view;

public class OutputView {

    public static void printStart() {
        System.out.println("사각형 그리기 프로그램");
    }

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

    public static void printEnd() {
        System.out.println("프로그램을 종료합니다.");
    }
}
