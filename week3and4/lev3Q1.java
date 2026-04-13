import java.util.Scanner;

public class lev3Q1 {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        year = input.nextInt();

        if (year < 1582) {
            System.out.println("Invalid input. Year should be >= 1582.");
        } 
        else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } 
        else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year");
        } 
        else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } 
        else {
            System.out.println(year + " is not a Leap Year");
        }

        input.close();
    }
}