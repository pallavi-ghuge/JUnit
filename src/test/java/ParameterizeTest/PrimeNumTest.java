package ParameterizeTest;

import ParameterizedTEstDemo.PrimeNumberChecker;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class PrimeNumTest {
    private  Integer inputnumber;
    private  boolean expResult;
    private PrimeNumberChecker primeNumberChecker;

    @Before
    public void initialize(){
        primeNumberChecker=new PrimeNumberChecker();
    }
    public PrimeNumTest(Integer inputnumber,boolean expResult){
        this.inputnumber=inputnumber;
        this.expResult=expResult;
    }
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {2, true},
                {6, false},
                {19, true},
                {22, false},
                {23, true},
        });
    }
    @Test
    public void testPreimeNumber()
    {
        System.out.println("parameterized number is ::"+inputnumber);
         assertEquals(expResult,primeNumberChecker.validate(inputnumber));
    }
}

