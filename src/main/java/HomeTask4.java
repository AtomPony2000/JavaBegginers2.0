import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Класс для ДЗ по массивам
 */
public class HomeTask4 {

    /**
     * Массив размерностью 20,
     * заполняется случайными целыми числами от -10 до 10.
     * Находим максимальный отрицательный и минимальный положительный элементы массива.
     * И меняем их местами.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] values = generateData();
        System.out.println("Массив: " + Arrays.toString(values));
        Map<String, Integer> result = findMinPosition(values);
        System.out.println("Максиимальное отрицательное значение: " + result.get("maxNegative") + " Минимальное положительное значение: " + result.get("minPositive"));
        swapElements(result.get("indexMinPositive"), result.get("indexMaxNegative"), values);
        System.out.println("Развернутый массив: " + Arrays.toString(values));
    }

    /**
     * Генирируем массив из 20 символов
     * в диапазоне от -10 до 10
     *
     * @return
     */
    private static int[] generateData() {
        int value = 20;
        int min = -10;
        int max = 10;
        int[] array = new int[value];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min)) + min;
        }
        return array;
    }

    /**
     * Находим максимальный отрицательный элемент массива
     *
     * @param values массив
     * @return max/min
     */
    private static Map<String, Integer> findMinPosition(int[] values) {
        int minPositive = 0, maxNegative = 0;
        int indexMinPositive = 0, indexMaxNegative = 0;
        for (int i = 0; i < values.length; i++) {
            int element = values[i];
            if (element < minPositive && element >= 1 || minPositive == 0 && element > 0) {
                minPositive = element;
                indexMinPositive = i;
                continue;
            }

            if (element > maxNegative && element <= -1 || maxNegative == 0 && element < 0) {
                maxNegative = element;
                indexMaxNegative = i;
                continue;
            }

        }
        Map<String, Integer> pair = new HashMap<>();
        pair.put("minPositive", minPositive);
        pair.put("maxNegative", maxNegative);
        pair.put("indexMinPositive", indexMinPositive);
        pair.put("indexMaxNegative", indexMaxNegative);

        return pair;
    }

    /**
     * Меняем местами max & min
     *
     * @param min
     * @param max
     * @param values
     */
    private static void swapElements(int min, int max, int[] values) {
        int revert = values[max];
        values[max] = values[min];
        values[min] = revert;
    }

}


