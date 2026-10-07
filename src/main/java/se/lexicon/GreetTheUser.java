package se.lexicon;
import java.util.Scanner;
public class GreetTheUser {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter first name:");
        String firstName = scanner.nextLine();
        IO.println("Enter last name:");
        String lastName = scanner.nextLine();
        IO.println("Hello, " + firstName + " " + lastName + "! Welcome aboard.");
    }
}
