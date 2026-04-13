import java.util.Scanner;

public class lev2Q6 {
    public static void main(String[] args) {
        int ageAmar, ageAkbar, ageAnthony;
        double heightAmar, heightAkbar, heightAnthony;

        Scanner input = new Scanner(System.in);

        // Input ages
        System.out.print("Enter age of Amar: ");
        ageAmar = input.nextInt();

        System.out.print("Enter age of Akbar: ");
        ageAkbar = input.nextInt();

        System.out.print("Enter age of Anthony: ");
        ageAnthony = input.nextInt();

        // Input heights
        System.out.print("Enter height of Amar: ");
        heightAmar = input.nextDouble();

        System.out.print("Enter height of Akbar: ");
        heightAkbar = input.nextDouble();

        System.out.print("Enter height of Anthony: ");
        heightAnthony = input.nextDouble();

        // Find youngest
        int youngestAge = ageAmar;
        String youngestFriend = "Amar";

        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngestFriend = "Akbar";
        }

        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngestFriend = "Anthony";
        }

        // Find tallest
        double tallestHeight = heightAmar;
        String tallestFriend = "Amar";

        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallestFriend = "Akbar";
        }

        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallestFriend = "Anthony";
        }

        System.out.println("Youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("Tallest friend is " + tallestFriend + " with height " + tallestHeight);

        input.close();
    }
}