package CalculatorOOP.NewCalculate.Operations.pack.Calculator;

import CalculatorOOP.NewCalculate.Operations.pack.InputValue.InputValueScanner;
import CalculatorOOP.NewCalculate.Operations.pack.Printer.Printer;
import CalculatorOOP.NewCalculate.Operations.pack.Proccesor.Proccesor;
import CalculatorOOP.NewCalculate.Operations.pack.Proccesor.ProccesorImpl;

public class Calculator {
    private Proccesor proccesor;
    private Printer printer;
    private InputValueScanner inputValueScanner;

    public Calculator() {
        printer = new Printer();
        proccesor = new ProccesorImpl();
        inputValueScanner = new InputValueScanner();
    }

    public void calculate() {
        float result = 0;
        float firstValue = 0;
        float secondValue = 0;
        String operation = null;
        boolean firstValueInit = false, secondValueInit = false, operationInit = false;

        while (!firstValueInit || !secondValueInit || !operationInit) {
            try {
                if (!firstValueInit) {
                    firstValue = inputValueScanner.getValue();
                    firstValueInit = true;
                }
                if (!operationInit) {
                    operation = inputValueScanner.getOperation();
                    operationInit = true;
                }
                if (!secondValueInit) {
                    secondValue = inputValueScanner.getValue();
                    if (secondValue == 0 && "/".equals(operation)) {
                        throw new IllegalArgumentException("Деление на ноль запрещено");
                    }
                    secondValueInit = true;
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        }

        switch (operation) {
            case "+":
                result = proccesor.addition(firstValue, secondValue);
                break;
            case "-":
                result = proccesor.subtraction(firstValue, secondValue);
                break;
            case "*":
                result = proccesor.multiplication(firstValue, secondValue);
                break;
            case "/":
                result = proccesor.division(firstValue, secondValue);
                break;
        }
        printer.printFloatWithAccuracy(result);
    }
}
