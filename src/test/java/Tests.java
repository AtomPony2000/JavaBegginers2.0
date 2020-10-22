import CalculatorOOP.NewCalculate.Operations.pack.InputValue.InputValueScanner;
import CalculatorOOP.NewCalculate.Operations.pack.Proccesor.ProccesorImpl;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class Tests {

    @Test
    public void testAdditional(){
        ProccesorImpl proccesor = new ProccesorImpl();
        float expectedResult = (float) 3.0000;
        float actualResult = proccesor.addition(1, 2);
        Assert.assertEquals("Ошибка при сложении!", expectedResult, actualResult, 0);
    }
    @Test
    public void testSubtraction(){
        ProccesorImpl proccesor = new ProccesorImpl();
        float expectedResult = (float) 5.0000;
        float actualResult = proccesor.subtraction(7, 2);
        Assert.assertEquals("Ошибка при вычитании!", expectedResult, actualResult, 0);
    }
    @Test
    public void testMultiplication(){
        ProccesorImpl proccesor = new ProccesorImpl();
        float expectedResult = (float) 8.0000;
        float actualResult = proccesor.multiplication(4, 2);
        Assert.assertEquals("Ошибка при умножении!", expectedResult, actualResult, 0);
    }
    @Test
    public void testDivision(){
        ProccesorImpl proccesor = new ProccesorImpl();
        float expectedResult = (float) 4.0000;
        float actualResult = proccesor.division((float) 10.000, (float) 2.500);
        Assert.assertEquals("Ошибка при сложении!", expectedResult, actualResult, 0);
    }

    @Test
    public void testInput(){
        String expectedResult = "3.0";
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream(expectedResult.getBytes());
        System.setIn(in);
        InputValueScanner inputValueScanner = new InputValueScanner();
        float actualResult = inputValueScanner.getValue();
        System.setIn(sysInBackup);
        Assert.assertEquals("Ошибка ввода!", Float.parseFloat(expectedResult), actualResult, 0);
    }

    @Test
    public void testInputOperation(){
        String expectedResult = "*";
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream(expectedResult.getBytes());
        System.setIn(in);
        InputValueScanner inputValueScanner = new InputValueScanner();
        String actualResult = inputValueScanner.getOperation();
        System.setIn(sysInBackup);
        Assert.assertEquals("Ошибка ввода!", expectedResult, actualResult);
    }
}
