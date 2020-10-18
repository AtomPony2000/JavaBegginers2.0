package CalculatorOOP.NewCalculate.Operations.pack.InputValue;

import java.util.Scanner;

public class InputValueScanner {

    Scanner sc = new Scanner(System.in);

    public float getValue() {
        System.out.println("Введите число: ");
        return sc.nextFloat();
    }

    public char getOperation() {
        System.out.println("Выберите операцию: ");
        return sc.next().charAt(0);
    }
}
