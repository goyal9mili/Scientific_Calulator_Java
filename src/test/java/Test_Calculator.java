

import static org.junit.Assert.*;
import org.junit.Test;


public class Test_Calculator {

    @Test
    public void TestLog3() throws NegativeNumberException
    {
        double ans = Calculator.log(3);
        assertEquals(1.0986122886681098, ans, 0);
    }

    @Test
    public void TestLog1() throws NegativeNumberException
    {
        double ans = Calculator.log(1);
        assertEquals(0.0, ans, 0);
    }

    @Test
    public void Testroot5() throws NegativeNumberException
    {
        double ans = Calculator.root(5);
        assertEquals(2.23606797749979, ans, 0);
    }

    @Test
    public void Testroot1() throws NegativeNumberException
    {
        double ans = Calculator.root(1);
        assertEquals(1.0, ans, 0);
    }

    @Test(expected = NegativeNumberException.class)
    public void testnegative()
    {
        Calculator.root(-1);
    }

    @Test
    public void Testfact5() throws NegativeNumberException
    {
        double ans = Calculator.fact(5);
        assertEquals(120.0, ans, 0);
    }

    @Test
    public void Testfact100() throws NegativeNumberException
    {
        double ans = Calculator.fact(100);
        assertEquals(9.33262154439441E157, ans, 0);
    }

    @Test
    public void Testpow1_0()
    {
        double ans = Calculator.powerfunc(1,0);
        assertEquals(1.0, ans, 0);
    }

    @Test
    public void Testpow0_1()
    {
        double ans = Calculator.powerfunc(0,1);
        assertEquals(0.0, ans, 0);
    }




}
