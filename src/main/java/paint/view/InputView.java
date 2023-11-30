package paint.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String DELIMITER = ",";
    private static Scanner console = new Scanner(System.in);
    public static List<Integer> getFirstPoint() {
        System.out.println("첫 번째 점의 좌표를 입력하세요. (예: 10, 10)");
        return getPoint();
    }

    public static List<Integer> getSecondPoint() {
        System.out.println("두 번째 점의 좌표를 입력하세요. (예: 70, 20)");
        return getPoint();
    }

    public static List<Integer> getPoint() {
        String input = console.nextLine();
        String[] numbers = input.split(DELIMITER);

        return List.of(parseInt(numbers[0]), parseInt(numbers[1].trim()));
    }

    private static int parseInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException();
        }
    }
}
