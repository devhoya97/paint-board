package paint;

import paint.view.OutputView;

public class Application {
    public static void main(String[] args) {
        PaintBoard paintBoard = new PaintBoard();
        paintBoard.paintRectangle(new Point(10,10), new Point(70,20));
        OutputView.printPaintBoard(paintBoard.getBoard());
    }
}
