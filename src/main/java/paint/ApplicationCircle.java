package paint;

import paint.view.OutputView;

public class ApplicationCircle {
    public static void main(String[] args) {
        PaintBoard paintBoard = new PaintBoard();
        Circle circle = new Circle(new Point(35, 15), 10);
        paintBoard.paintCircle(circle);
        OutputView.printPaintBoard(paintBoard.getBoard());
    }
}
