package CalculatorOOP.NewCalculate.Operations.pack.Calculator;

import CalculatorOOP.NewCalculate.Operations.pack.InputValue.InputValueScanner;
import CalculatorOOP.NewCalculate.Operations.pack.Printer.Printer;
import CalculatorOOP.NewCalculate.Operations.pack.Proccesor.Proccesor;
import CalculatorOOP.NewCalculate.Operations.pack.Proccesor.ProccesorImpl;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Proccesor proccesor;
    private Printer printer;
    private InputValueScanner inputValueScanner;

    public Calculator() {
        printer = new Printer();
        proccesor = new ProccesorImpl();
        inputValueScanner = new InputValueScanner();
    }

    public Map<String, Object> readInputValues() {

        Map<String, Object> values = new HashMap();

        boolean firstValueInit = false, secondValueInit = false, operationInit = false;

        while (!firstValueInit || !secondValueInit || !operationInit) {
            try {
                if (!firstValueInit) {
                    values.put("firstValue", inputValueScanner.getValue());
                    firstValueInit = true;
                }
                if (!operationInit) {
                    values.put("operation", inputValueScanner.getOperation());
                    operationInit = true;
                }
                if (!secondValueInit) {
                    values.put("secondValue", inputValueScanner.getValue());
                    if ((Float) values.get("secondValue") == 0 && "/".equals(values.get("operation"))) {
                        throw new IllegalArgumentException("Деление на ноль запрещено");
                    }
                    secondValueInit = true;
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }

        }
        return values;
    }

    public void calculate() {
        float result = 0;
        float firstValue = (float) readInputValues().get("firstValue");
        float secondValue = (float) readInputValues().get("secondValue");
        String operation = (String) readInputValues().get("operation");

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
