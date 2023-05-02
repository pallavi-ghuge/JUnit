import org.example.MyCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Myclalulatortext
{
    @Test
    public void sum()
    {
        MyCalculator m=new MyCalculator();
        int Result=m.sum(10,20);
        assertEquals(30,Result);
    }
    @Test
    public void mul()
    {
        MyCalculator m=new MyCalculator();
        int Result=m.sum(10,20);
        assertEquals(10,Result);
    }
    @Test
    public void div()
    {
        MyCalculator m=new MyCalculator();
        int Result=m.sum(10,20);
        assertEquals(10,Result);
    }
    @Test
    public void sub()
    {
        MyCalculator m=new MyCalculator();
        int Result=m.sum(10,20);
        assertEquals(10,Result);
    }
}
