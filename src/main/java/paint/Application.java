package paint;

import java.util.List;
import paint.view.InputView;
import paint.view.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView.printStart();

        PaintBoard paintBoard = new PaintBoard();
        paintBoard.paintRectangle(getValidFirstPoint(), getValidSecondPoint());

        OutputView.printPaintBoard(paintBoard.getBoard());
        OutputView.printEnd();
    }

    private static Point getValidFirstPoint() {
        while (true) {
            try {
                List<Integer> firstNumbers = InputView.getFirstPoint();
                return new Point(firstNumbers.get(0), firstNumbers.get(1));
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    private static Point getValidSecondPoint() {
        while (true) {
            try {
                List<Integer> firstNumbers = InputView.getSecondPoint();
                return new Point(firstNumbers.get(0), firstNumbers.get(1));
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
