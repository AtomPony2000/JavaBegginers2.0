package CalculatorOOP.NewCalculate.Operations.pack.Proccesor;

public class ProccesorImpl implements Proccesor {

    @Override
    public float addition(float val1, float val2) {
        return val1 + val2;
    }

    @Override
    public float subtraction(float val1, float val2) {
        return val1 - val2;
    }

    @Override
    public float multiplication(float val1, float val2) {
        return val1 * val2;
    }

    @Override
    public float division(float val1, float val2) {
        return val1 / val2;
    }
}
