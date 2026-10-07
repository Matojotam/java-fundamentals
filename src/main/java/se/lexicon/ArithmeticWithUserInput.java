package se.lexicon;
import java.util.Scanner;
public class ArithmeticWithUserInput {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter first number");
        int firstNumber = scanner.nextInt();
        IO.println("Enter second number");
        int secondNumber = scanner.nextInt();
        IO.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        IO.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        IO.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        IO.println(firstNumber + " / " + secondNumber + " = " + ((double)firstNumber / secondNumber));
    }
}
