package CalculatorOOP.NewCalculate.Operations.pack.Printer;

public class Printer {
    public void printFloatWithAccuracy(float value) {
        System.out.println(String.format("%.4f", value));
    }

    public void error() {
        System.out.println("Нет такой операции!");
    }
}
