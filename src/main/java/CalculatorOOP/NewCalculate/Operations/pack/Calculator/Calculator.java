package CalculatorOOP.NewCalculate.Operations.pack.Calculator;

import CalculatorOOP.NewCalculate.Operations.pack.InputValue.InputValueScanner;
import CalculatorOOP.NewCalculate.Operations.pack.Printer.Printer;
import CalculatorOOP.NewCalculate.Operations.pack.Proccesor.Proccesor;
import CalculatorOOP.NewCalculate.Operations.pack.Proccesor.ProccesorImpl;

public class Calculator {
    Proccesor proccesor;
    Printer printer;
    InputValueScanner inputValueScanner;

    public Calculator() {
        printer = new Printer();
        proccesor = new ProccesorImpl();
        inputValueScanner = new InputValueScanner();
    }

    public void calculate() {
        float result;
        float firstValue = inputValueScanner.getValue();
        float secondValue = inputValueScanner.getValue();
        char operation = inputValueScanner.getOperation();

        switch (operation) {
            case '+':
                result = proccesor.addition(firstValue, secondValue);
                break;
            case '-':
                result = proccesor.subtraction(firstValue, secondValue);
                break;
            case '*':
                result = proccesor.multiplication(firstValue, secondValue);
                break;
            case '/':
                result = proccesor.division(firstValue, secondValue);
                break;
            default:
                printer.error();
                return;
        }

        printer.printFloatWithAccuracy(result);


    }
}
