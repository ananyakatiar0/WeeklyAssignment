import java.util.Scanner;

public class lev1Q3 {
    public static void main(String[] args) {
        int number1, number2, number3;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        int max = number1;

        if (number2 > max) {
            max = number2;
        }

        if (number3 > max) {
            max = number3;
        }

        System.out.println("Is the first number the largest? " + (number1 == max ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (number2 == max ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (number3 == max ? "Yes" : "No"));

        input.close();
    }
}