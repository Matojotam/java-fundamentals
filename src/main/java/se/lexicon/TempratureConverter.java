package se.lexicon;

import java.util.Scanner;

public class TempratureConverter {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        IO.print("Enter temperature in Celsius: ");
        int celsius = scanner.nextInt();
        double fahrenheit = (celsius * 9.0 / 5 + 32);
        double kelvin = (celsius + 273.15);
        IO.println("Celsius:    " + celsius +" °C");
        IO.println("Fahrenheit:    " + fahrenheit +" °F");
        IO.println("Kelvin:    " + kelvin +" °K");



    }

}
