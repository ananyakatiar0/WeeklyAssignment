import java.util.Scanner;

public class lev3Q5 {
    public static void main(String[] args) {
        int number, originalNumber, digit;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        originalNumber = number;

        // Loop to extract digits
        while (originalNumber != 0) {
            digit = originalNumber % 10;              // get last digit
            sum = sum + (digit * digit * digit);      // cube and add to sum
            originalNumber = originalNumber / 10;     // remove last digit
        }

        // Check Armstrong condition
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        input.close();
    }
}