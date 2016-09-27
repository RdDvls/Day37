import java.util.Scanner;

/**
 * Created by RdDvls on 9/27/16.
 */
public class Factorial {
//    public static void main(String[] args) {
//        System.out.println("Running");
//        Factorial doMath = new Factorial();
//        System.out.println(doMath.factorial(5));
//    }

    public long factorial(long number) {
        if (number <=1 ) {
            return 1;
        }
        return number * factorial(number-1);
    }
}

