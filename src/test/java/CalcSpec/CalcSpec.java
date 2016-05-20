package CALCULATOR;

/**
 * Created by taiseerhabib on 4/30/16.
 */

import CALCULATOR.Calculator;
import CALCULATOR.Number;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcSpec {
    @Test
    public void sumTest(){
        Calculator cal = new Calculator();

        //Z__Number_Downgrade testnum = new Z__Number_Downgrade();
        //Z__Display_Downgrade display = new Z__Display_Downgrade();
        double[] expectedNum = new double[0];
        double[] actualNum = testnum.checkNumber();
        assertArrayEquals("The expected value should be 2",expectedNum,actualNum,0.0);
}
