import java.lang.Math;

public class Calculator {

    public static double log(double num) {

        if(num < 0)
        {
            throw new NegativeNumberException();
        }
        return Math.log(num);
    }

    public static double fact(double num) {

        if(num < 0)
        {
            throw new NegativeNumberException();
        }
        return Factorial.factorial(num);

    }

    public static double powerfunc(double base, double power)
    {
        return Math.pow(base,power);
    }

    public static double root(double num)
    {
        if(num < 0)
        {
            throw new NegativeNumberException();
        }
        return Math.sqrt(num);
    }



}
