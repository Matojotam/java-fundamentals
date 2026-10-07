package se.lexicon;

public class SwapTwoVaaluesWithoutATempVariable {
    static void main(){
        int a = 15;
        int b = 42;
        IO.println("Before: a = " + a + ", B = " +b);
        a = a + b;
        b = a - b;
        a = a - b;

        IO.println("After: a = " + a + ", b = " + b );

    }
}
