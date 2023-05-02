import CalCulatorDemo.SumDemo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuiteDemoTest {
    @Test
    public void sum()
    {
        SumDemo s=new SumDemo();
        double su=s.sum(120d,120d);
        assertEquals(240,su);

    }
}
