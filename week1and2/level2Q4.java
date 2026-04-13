import java.util.Scanner;

public class level2Q4{
    public static void main(String[] args) {
        double distanceInFeet;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Convert feet to yards
        double yards = distanceInFeet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double miles = yards / 1760;

        System.out.println("The distance in yards is " + yards +
                           " while the distance in miles is " + miles);

        input.close();
    }
}