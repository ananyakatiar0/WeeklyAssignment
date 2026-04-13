import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        double km;
        double miles;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Given: 1 mile = 1.6 km
        miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}