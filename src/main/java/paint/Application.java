package paint;

import paint.view.OutputView;

public class Application {
    public static void main(String[] args) {
        PaintBoard paintBoard = new PaintBoard();
        OutputView.printPaintBoard(paintBoard.getBoard());
    }
}
