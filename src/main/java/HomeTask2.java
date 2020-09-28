import java.util.Scanner;

public class HomeTask2 {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Метод обрабатывает выбранную операцию в float
     * и ограничивает вывод до 4 знаков после запятой
     *
     * @param args
     */
    public static void main(String[] args) {
        float num1 = getFloat();
        float num2 = getFloat();
        char operation = getOperation();
        String result = String.format("%.4f", calc(num1, num2, operation));
        System.out.println("Результат операции: " + result);
    }

    /**
     * Cчитываем с консоли float
     * @return
     */
    public static float getFloat() {
        System.out.println("Введите число:");
        return Float.parseFloat(scanner.nextLine());
    }

    /**
     * Cчитывать с консоли тип операции
     * @return
     */
    public static char getOperation() {
        System.out.println("Введите операцию:\n + \n - \n * \n /");
        return scanner.next().charAt(0);
    }

    /**
     * Арифметическая операция
     * @param num1
     * @param num2
     * @param operation
     * @return
     */
    public static float calc(float num1, float num2, char operation) {
        float result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
