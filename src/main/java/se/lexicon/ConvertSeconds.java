package se.lexicon;
import java.util.Scanner;
public class ConvertSeconds {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter seconds");
        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int remaining = remainingSeconds % 60;
        IO.println(hours + ":" + minutes + ":" +remaining);
    }
}
