package CalculatorOOP.NewCalculate.Operations.pack.InputValue;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InputValueScanner {

    Scanner sc = new Scanner(System.in);
    Set<String> operations = new HashSet<>();

    public InputValueScanner(){
        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add("/");

    }

    public float getValue() throws NumberFormatException {
        System.out.println("Введите число: ");
        String value = sc.next();
        return Float.parseFloat(value);
    }

    public String getOperation() throws IllegalArgumentException{
        System.out.println("Выберите операцию: ");
        String operation = sc.next();
        if (operations.contains(operation)){
            return operation;
        }else {
            throw new IllegalArgumentException("Неверный тип операции");
        }

    }
}
