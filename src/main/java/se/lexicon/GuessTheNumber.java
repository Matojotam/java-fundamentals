package se.lexicon;

import java.util.Scanner;

public class GuessTheNumber {
    static void main(){
        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * 500) + 1;
        int count = 1;

        IO.println("Enter your guess:");
        int guess = scanner.nextInt();

        while (number != guess) {
            count = count + 1;
            if (guess < number) {
                IO.println("Too small!");
                guess = scanner.nextInt();
            } else {
                IO.println("Too big!");
                guess = scanner.nextInt();
            }
        }
        IO.print("Correct! you got it in " + count + " guesses.");

            }
        }


