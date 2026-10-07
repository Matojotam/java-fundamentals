package se.lexicon;

import java.util.Scanner;

public class AverageOfThreeNumbers {
        static void main() {
            Scanner scanner = new Scanner(System.in);
            IO.println("Enter the first number");
            double number1 = scanner.nextDouble();
            IO.println("Enter the second number");
            double number2 = scanner.nextDouble();
            IO.println("Enter the third number");
            double number3 = scanner.nextDouble();
            double total = number1 + number2 + number3;
            double average = total / 3;
            IO.println(average);
        }
}
