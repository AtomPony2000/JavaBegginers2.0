import java.util.Scanner;

/**
 * Свитчер для определнеия задания
 */
public class HomeTask3Switсher {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int inputValue = getInt();
        switch (inputValue) {
            case 1:
                HomeTask2Calculator calc = new HomeTask2Calculator();
                calc.calculate(args);
                break;
            case 2:
                HomeTask3MaxElement max = new HomeTask3MaxElement();
                max.findMaxElement(args);
                break;
            default:
                System.out.println("Ошибка. Повторите ввод.");
        }


    }

    /**
     * Cчитываем с консоли int
     *
     * @return
     */
    public static int getInt() {
        System.out.println("Введите число:");
        return Integer.parseInt((scanner.next()));
    }

}
