import java.util.Scanner;

/**
 * Класс для поиска максимального элемента в массиве
 */

public class HomeTask3MaxElement {

    protected static String[] motivation = {
            "Еще!", "Да что ты можешь?", "Камон!", "Используй силу!",
            "Слабак", "Моя бабушка быстрее печатает"
    };

    /**
     * Ищем максимальный элемент
     *
     * @param args
     * @return
     */
    public String findMaxElement(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Укажи размер массива");
        String[] mass = new String[sc.nextInt()];
        System.out.println("Введите значение(String): ");
        for (int i = 0; i < mass.length; i++) {
            System.out.println(motivation[(int) (Math.random() * motivation.length)]);
            mass[i] = sc.next();
        }

        StringBuilder builder = new StringBuilder();
        for (String s : mass) {
            builder.append(s + " ");
        }
        String inputValue = builder.toString();

        int largestLength = 0;
        String largestWord = "";

        for (String word : inputValue.split(" ")) {
            if (largestWord.length() == 0) {
                largestLength = word.length();
                largestWord = word;
            } else if (word.length() >= largestLength) {
                largestLength = word.length();
                largestWord = word;
            }
        }
        sc.close();
        System.out.println("Longest Word: " + largestWord);
        return largestWord;
    }
}
