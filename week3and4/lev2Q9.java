import java.util.Scanner;

public class lev2Q9{
    public static void main(String[] args) {
        int number;
        int greatestFactor = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("The greatest factor of " + number + " beside itself is " + greatestFactor);

        input.close();
    }
}