import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter the number corresponding to the operator \n 1 : square_root \n " +
                    "2 : factorial \n 3: log \n 4: power \n 5: Exit \n");
            char operator = reader.next().charAt(0);

            double result = -1;

            switch (operator) {
                case '1':
                    try{
                        logger.info("Performing square root function");
                        System.out.print("Enter the number to take root of : ");
                        double first = reader.nextDouble();
                        result = Calculator.root(first);
                        logger.info("Operation -----> square_root("+first+")");
                        logger.info("Result = "+ result);
                        System.out.println("The answer to your request is " + result);
                        break;
                    }
                    catch(NegativeNumberException e){
                        logger.error("Negative inout entered : Invalid");
//                    System.out.println("Cannot Enter a negative number");
                        break;
                    }




                case '2':
                    try{
                        logger.info("Performing factorial function");
                        System.out.print("Enter the number to take factorial of : ");
                        double second = reader.nextDouble();
                        logger.info("Operation -----> fact("+second+")");
                        result = Calculator.fact(second);
                        logger.info("Result = "+ result);
                        System.out.println("The answer to your request is " + result);
                        break;
                    }
                    catch(NegativeNumberException e){
                        logger.error("Negative inout entered : Invalid");
                        break;
                    }


                case '3':
                    try{
                        logger.info("Performing logarithmic function");
                        System.out.print("Enter the number to take log of : ");
                        double third = reader.nextDouble();
                        result = Calculator.log(third);
                        logger.info("Operation -----> log("+third+")");
                        logger.info("Result = "+ result);
                        System.out.println("The answer to your request is " + result);
                        break;
                    }
                    catch(NegativeNumberException e)
                    {
                        logger.error("Negative inout entered : Invalid");
                        break;
                    }


                case '4':
                    logger.info("Performing power function");
                    System.out.print("Enter base number %n: ");
                    double base = reader.nextDouble();
                    System.out.print("Enter the power number : ");
                    double power = reader.nextDouble();
                    result = Calculator.powerfunc(base, power);
                    logger.info("Operation -----> power("+base+", "+power+")");
                    logger.info("Result = "+ result);
                    System.out.println("The answer to your request is " + result);
                    break;

                case '5':
                    logger.info("exiting the application");
                    System.exit(0);

                default:
                    logger.error("the operator is not correct..select again");
                    System.out.println("Error! operator is not correct");

            }


        }
        }

}