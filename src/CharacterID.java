import java.util.Scanner;

public class CharacterID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a letter (A-Z or a-z): ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            int asciiValue = (int) ch;
            System.out.println("The value of " + ch + " is: " + asciiValue);
        } else {
            System.out.println("Invalid Input. Please enter a letter (A-Z or a-z).");
        }
        scanner.close();
    }
}
