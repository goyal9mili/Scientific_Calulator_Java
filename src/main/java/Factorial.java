public class Factorial {

    static double factorial(double n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }

}
