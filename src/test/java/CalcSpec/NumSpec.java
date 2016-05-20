package CALCULATOR;

/**
 * Created by taiseerhabib on 4/30/16.
 */
import CALCULATOR.Display;
import CALCULATOR.Number;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumSpec {

    @Test
    public void sumTest(){
    Number testnum = new Number();
    //Z__Display_Downgrade display = new Z__Display_Downgrade();
    double[] expectedNum = new double[3];
    double[] actualNum = testnum.checkNumber();
    assertArrayEquals("The expected value should be 2",expectedNum,actualNum,0.0);

        //assertArrayEquals("The expected value should be 2",expectedNum,actualNum,0);
    }

    /*
    private void assertEquals(String s, double expectedNum, double[] actualNum, int i) {
    }
    */

}
