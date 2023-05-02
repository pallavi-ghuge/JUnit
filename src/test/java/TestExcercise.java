import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestExcercise
{
    @Test
    public void asser_Equal()
    {
        String s="pallavi";
        String n="pallavi";
        assertEquals(s,n);
    }
    @Test
    public void assertSame()
    {
        List languages=new ArrayList();
        languages.add("1");
        List MoreLanguages=new ArrayList();
        assertNotSame(languages,MoreLanguages);
    }
    @Test
    public void asserArra()
    {
        int numbers[]={1,2,3};
        int[] otherNumbers=new int[3];
        otherNumbers[0]=1;
        otherNumbers[1]=2;
        otherNumbers[2]=3;
        assertArrayEquals(numbers,otherNumbers);
    }
    @Test
    public void asserfal()
    {
        String lan="PHP";
       // String lan="Java";
       //assertTrue(lan.contains("H"));
       assertFalse(lan.contains("J"));
    }

}
