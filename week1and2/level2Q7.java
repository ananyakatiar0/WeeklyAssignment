import java.util.Scanner;

public class level2Q7 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        a = input.nextInt();

        System.out.print("Enter value of b: ");
        b = input.nextInt();

        System.out.print("Enter value of c: ");
        c = input.nextInt();

        int result1 = a + b * c;   // * has higher precedence than +
        int result2 = a * b + c;   // * first, then +
        int result3 = c + a / b;   // / first, then +
        int result4 = a % b + c;   // % first, then +

        System.out.println("The results of Int Operations are " +
                result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}