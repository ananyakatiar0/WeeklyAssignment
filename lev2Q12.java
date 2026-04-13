import java.util.Scanner;

public class lev2Q12 {
    public static void main(String[] args) {
        int number, power;
        int result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.print("Enter power: ");
        power = input.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            System.out.println(number + " raised to the power " + power + " is " + result);
        }

        input.close();
    }
}