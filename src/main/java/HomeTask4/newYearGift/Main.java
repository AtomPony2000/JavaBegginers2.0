package HomeTask4.newYearGift;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        newYearGift();
    }

    public static void newYearGift() throws IOException {
        ArrayList<Goods> goods = new ArrayList<>();
        String[] names = new String[]{"Рачок", "Золотой петушок", "Skitles"};
        boolean stop = false;
        int totalPrice = 0;
        int totalWeight = 0;
        int totalCancerPrice = 0;
        int totalCancerWeight = 0;
        int totalGoldenCockerelPrice = 0;
        int totalGoldenCockerelWeight = 0;
        int totalSkitlesPrice = 0;
        int totalSkitlesWeight = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("На ветрине выставленны следующие образцы конфет: \n" +
                "'1' - конфеты '" + names[0] + "'\n" +
                "'2' - конфеты '" + names[1] + "'\n" +
                "'3' - леденец '" + names[2] + "'\n" +
                "'4' - чтобы остановиться нажми Enter(не выбирая товара) \n" +
                "Какие сам купишь, а какие маме подаришь?");

        while (!stop) {
            String line = reader.readLine();

            switch (line) {
                case "1":
                    Candy cancer = new Candy(names[0], 300, 175, 1010101);
                    goods.add(cancer);
                    totalPrice += cancer.getPrice();
                    totalCancerPrice += cancer.getPrice();
                    totalWeight += cancer.getWeight();
                    totalCancerWeight += cancer.getWeight();
                    System.out.println(String.format("Конфеты '%s' добавлены в подарок", names[0]));
                    break;
                case "2":
                    Candy goldenCockerel = new Candy(names[1], 100, 250, 202020);
                    goods.add(goldenCockerel);
                    totalPrice += goldenCockerel.getPrice();
                    totalGoldenCockerelPrice += goldenCockerel.getPrice();
                    totalWeight += goldenCockerel.getWeight();
                    totalGoldenCockerelWeight += goldenCockerel.getWeight();
                    System.out.println(String.format("Конфеты '%s' добавлены в подарок", names[1]));
                    break;
                case "3":
                    Jellybean Skitles = new Jellybean(names[2], 50, 120, 30303300);
                    goods.add(Skitles);
                    totalPrice += Skitles.getPrice();
                    totalSkitlesPrice += Skitles.getPrice();
                    totalWeight += Skitles.getWeight();
                    totalSkitlesWeight += Skitles.getWeight();
                    System.out.println(String.format("Жевательные конфеты '%s' добавлен в подарок", names[2]));
                    break;
                default:
                    stop = true;
                    break;
            }

        }

        System.out.println(String.format("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб. \nиз них:", totalWeight, totalPrice));
        System.out.println(String.format("Конфеты '%s' гр. %s на сумму %s руб.", names[0], totalCancerWeight, totalCancerPrice));
        System.out.println(String.format("Конфеты '%s' гр. %s на сумму %s руб.", names[1], totalGoldenCockerelWeight, totalGoldenCockerelPrice));
        System.out.println(String.format("Конфеты '%s' гр. %s на сумму %s руб.", names[2], totalSkitlesWeight, totalSkitlesPrice));
    }
}
