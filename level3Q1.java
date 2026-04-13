import java.util.Scanner;

public class level3Q1 {
    public static void main(String[] args) {
        double celsius, fahrenheitResult;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        // Formula: (°C × 9/5) + 32 = °F
        fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        input.close();
    }
}