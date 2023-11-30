package paint;

import java.util.List;
import paint.view.InputView;
import paint.view.OutputView;

public class ApplicationCircle {
    public static void main(String[] args) {
        OutputView.printStart();

        Circle circle = getValidCircle();

        PaintBoard paintBoard = new PaintBoard();
        paintBoard.paintShape(circle, '*');
        OutputView.printPaintBoard(paintBoard.getBoard());

        OutputView.printEnd();
    }

    private static Circle getValidCircle() {
        while (true) {
            try {
                List<Integer> numbers = InputView.getOriginAndRadius();
                return new Circle(new Point(numbers.get(0), numbers.get(1)), numbers.get(2));
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
