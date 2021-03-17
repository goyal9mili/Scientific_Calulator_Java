

import static org.junit.Assert.*;
import org.junit.Test;


public class Test_Calculator {
    private static final double DELTA = 1e-16;


    @Test
    public void TestLog3() throws NegativeNumberException
    {
        double ans = Calculator.log(3);
        assertEquals(1.0986122886681098, ans, DELTA);
    }

    @Test
    public void TestLog1() throws NegativeNumberException
    {
        double ans = Calculator.log(1);
        assertEquals(0.0, ans, DELTA);
    }

    @Test
    public void TestFalseLog5() throws NegativeNumberException
    {
        double ans = Calculator.log(5);
        assertNotEquals(ans, 3.4, DELTA);
    }
    @Test
    public void Testroot5() throws NegativeNumberException
    {
        double ans = Calculator.root(5);
        assertEquals(2.23606797749979, ans, DELTA);
    }

    @Test
    public void Testroot1() throws NegativeNumberException
    {
        double ans = Calculator.root(1);
        assertEquals(1.0, ans, DELTA);
    }
    @Test
    public void TestFalseRoot8() throws NegativeNumberException
    {
        double ans = Calculator.root(8);
        assertNotEquals(ans, 3, DELTA);
    }

    @Test(expected = NegativeNumberException.class)
    public void testNegative()
    {
        Calculator.root(-1);
    }

    @Test
    public void TestFact5() throws NegativeNumberException
    {
        double ans = Calculator.fact(5);
        assertEquals(120.0, ans, DELTA);
    }

    @Test
    public void TestFact100() throws NegativeNumberException
    {
        double ans = Calculator.fact(100);
        assertEquals(9.33262154439441E157, ans, DELTA);
    }

    @Test
    public void TestFalseFact1() throws NegativeNumberException
    {
        double ans = Calculator.fact(1);
        assertNotEquals(ans, 0, DELTA);
    }

    @Test
    public void TestPow1_0()
    {
        double ans = Calculator.powerfunc(1,0);
        assertEquals(1.0, ans, DELTA);
    }

    @Test
    public void TestPow0_1()
    {
        double ans = Calculator.powerfunc(0,1);
        assertEquals(0.0, ans, DELTA);
    }
    @Test
    public void TestFalsePow3_2() throws NegativeNumberException
    {
        double ans = Calculator.powerfunc(3, 2);
        assertNotEquals(ans, 9.1, DELTA);
    }




}
