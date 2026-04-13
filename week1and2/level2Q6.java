import java.util.Scanner;

public class level2Q6{
    public static void main(String[] args) {
        int number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        if (number2 != 0) {
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            System.out.println("The Quotient is " + quotient +
                    " and Reminder is " + remainder +
                    " of two number " + number1 + " and " + number2);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        input.close();
    }
}