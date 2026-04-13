import java.util.Scanner;

public class level2Q2 {
    public static void main(String[] args) {
        double base, height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert cm² to in² (1 inch = 2.54 cm → 1 in² = 6.4516 cm²)
        double areaIn = areaCm / 6.4516;

        System.out.println("The Area of the triangle in sq in is " + areaIn +
                           " and sq cm is " + areaCm);

        input.close();
    }
}
