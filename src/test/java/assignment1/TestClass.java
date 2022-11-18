package assignment1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    public void testday() throws ExceptionClass {
    Calender calender=new Calender();
    String result=calender.NextDay("12/12/2012");
    String expected = "13/12/2012";
    assertEquals(expected,result);
    }
    @Test
    public void testMonth() throws ExceptionClass {
        Calender calender=new Calender();
        String result=calender.NextDay("30/4/2012");
        String expected = "1/5/2012";
        assertEquals(expected,result);
    }
    @Test
    public void testYear() throws ExceptionClass {
        Calender calender=new Calender();
        String result=calender.NextDay("31/12/2021");
        String expected = "1/1/2022";
        assertEquals(expected,result);
    }
    @Test
    public void testleapyear() throws ExceptionClass {
        Calender calender=new Calender();
        String result=calender.NextDay("29/2/2016");
        String expected = "1/3/2016";
        assertEquals(expected,result);

        Calender cal=new Calender();
         String result2=cal.NextDay("28/2/2017");
        String expected2 = "1/3/2017";
        assertEquals(expected2,result2);
    }
}
