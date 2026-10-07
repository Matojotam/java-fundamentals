package se.lexicon;

import java.util.Scanner;

public class GradeCalculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        IO.print("Enter score: ");
        int score = scanner.nextInt();
        if (score>= 90) {
            IO.println("Grade: A");
        } else if (score >= 80) {
            IO.println("Grade: B");
        } else if (score >= 70) {
            IO.println("Grade: C");
        } else if (score >= 60) {
            IO.println("Grade: D");
        } else {
            IO.println("Grade: F");
        }
    }
}
