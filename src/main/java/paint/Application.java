package paint;

import java.util.List;
import paint.view.InputView;
import paint.view.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView.printStart();

        Circle circle = getValidCircle();

        PaintBoard paintBoard = new PaintBoard();
        paintBoard.paintShape(circle, '*');
        OutputView.printPaintBoard(paintBoard.getBoard());

        OutputView.printEnd();

        Rectangle rectangle = new Rectangle(new Point(10, 10), new Point(15, 15));
        paintBoard.paintShape(rectangle, 'x');

        OutputView.printPaintBoard(paintBoard.getBoard());
    }

    // 올바른 명령어 받기부터 구현

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
