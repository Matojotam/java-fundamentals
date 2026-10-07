package se.lexicon;

import java.util.Scanner;

public class ShoppingReceipt {
    static void main() {
        double apple = 15.00;
        double milk = 22.50;
        double bread = 18.00;
        Scanner scanner = new Scanner(System.in);

        IO.println("How many Apples?: ");
        int applest = scanner.nextInt();
        IO.println("How much Milk?: ");
        int milkst = scanner.nextInt();
        IO.println("How much bread?");
        int breadst = scanner.nextInt();

        double appletotal = apple * applest;
        double milktotal = milk * milkst;
        double breadtotal = bread * breadst;
        double total = appletotal + milktotal + breadtotal;

        IO.println("==============================");
        IO.println("           Receipt");
        IO.println("==============================");
        IO.println(String.format("Apple        %d x %.2f = %.2f SEK", applest, apple, appletotal));
        IO.println(String.format("Milk         %d x %.2f = %.2f SEK", milkst, milk, milktotal));
        IO.println(String.format("Bread        %d x %.2f = %.2f SEK", breadst, bread, breadtotal));
        IO.println("------------------------------");
        IO.println(String.format("Grand Total:           %.2f SEK", total));
        IO.println("==============================");
    }


}
