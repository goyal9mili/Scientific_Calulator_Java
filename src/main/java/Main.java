import java.util.Scanner;

public class Main {

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
                        System.out.print("Enter the number to take root of : ");
                        double first = reader.nextDouble();
                        result = Calculator.root(first);
                        System.out.println("The answer to your request is " + result);
                        break;
                    }
                    catch(NegativeNumberException e){
//                    System.out.println("Cannot Enter a negative number");
                        break;
                    }




                case '2':
                    try{
                        System.out.print("Enter the number to take factorial of : ");
                        double second = reader.nextDouble();
                        result = Calculator.fact(second);
                        System.out.println("The answer to your request is " + result);
                        break;
                    }
                    catch(NegativeNumberException e){
                        break;
                    }


                case '3':
                    try{
                        System.out.print("Enter the number to take log of : ");
                        double third = reader.nextDouble();
                        result = Calculator.log(third);
                        System.out.println("The answer to your request is " + result);
                        break;
                    }
                    catch(NegativeNumberException e)
                    {
                        break;
                    }


                case '4':
                    System.out.print("Enter base number %n: ");
                    double base = reader.nextDouble();
                    System.out.print("Enter the power number : ");
                    double power = reader.nextDouble();
                    result = Calculator.powerfunc(base, power);
                    System.out.println("The answer to your request is " + result);
                    break;

                case '5':
                    System.exit(0);

                default:

                    System.out.println("Error! operator is not correct");

            }


        }
        }

}