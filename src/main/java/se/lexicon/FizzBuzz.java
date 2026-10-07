package se.lexicon;

public class FizzBuzz {
    static void main(){
        for (int i = 1; i <= 30; ++i){
            if (i % 3 == 0  && i % 5 == 0) {
                IO.println("FizzBuzz");
            }
            else if (i % 5 == 0) {
                IO.println("Buzz");
            }
            else if (i % 3 == 0) {
                IO.println("Fizz");
            }
            else {
                IO.println(i);
            }


        }
    }
}
