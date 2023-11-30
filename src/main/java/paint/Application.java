package paint;

import java.util.List;
import paint.view.InputView;
import paint.view.OutputView;

public class Application {
    public static void main(String[] args) {
        List<Integer> firstNumbers = InputView.getFirstPoint();
        List<Integer> secondNumbers = InputView.getSecondPoint();

        PaintBoard paintBoard = new PaintBoard();
        paintBoard.paintRectangle(
                new Point(firstNumbers.get(0),firstNumbers.get(1)),
                new Point(secondNumbers.get(0),secondNumbers.get(1))
        );
        OutputView.printPaintBoard(paintBoard.getBoard());
    }
}
