package se.lexicon;

import java.util.Scanner;

public class WeekdayOrWeekend {
    static void main(){
        Scanner scanner = new Scanner(System.in);

        IO.print("Enter day: ");
        String day = scanner.nextLine().toLowerCase();

        if (day.equals("monday")  || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")){
            IO.println("Weekday");
        }
        else if (day.equals("saturday") || day.equals("sunday")) {
            IO.println("Weekend");
        }
        else {
            IO.println("Unknown day");
        }
    }
}
