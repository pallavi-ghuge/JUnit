package TestSuit;
import static org.junit.Assert.assertEquals;


import CalCulatorDemo.SumDemo;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void sum()
    {
        SumDemo s=new SumDemo();
        double su=s.sum(100d,700d);       
        assertEquals(800,su);
        System.out.println("value not match");
    }
}
