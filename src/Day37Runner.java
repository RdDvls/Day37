/**
 * Created by RdDvls on 9/27/16.
 */
public class Day37Runner {
    public static void main(String[] args) {
//        Bubble and Selection Sorter:

//        int [] arrayToSort ={9,3,-6,12,-4};
//        BaseSorter selectionSorter = new SelectionSorter();
//        selectionSorter.sort(arrayToSort);
//        BaseSorter bubbleSorter = new BubbleSorter();
//        bubbleSorter.sort(arrayToSort);

//        Factorial:
//        Factorial doMath = new Factorial();
//        System.out.println(doMath.factorial(7));

//        Fibonacci:
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.getSimpleFibonacci(8));
//        System.out.println(fibonacci.getFibonnacciEff(8));
        System.out.println(fibonacci.numInvocations);

    }
}
