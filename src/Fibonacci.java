import java.util.HashMap;

/**
 * Created by RdDvls on 9/27/16.
 */
class Fibonacci{
    long numInvocations = 0;
    static HashMap<Long,Long> chachedFibs = new HashMap<Long, Long>();
    public long getSimpleFibonacci(long fibNum){
        numInvocations ++;
        if(fibNum == 0 || fibNum == 1){
            return fibNum;
        }
        return getSimpleFibonacci(fibNum - 1) + getSimpleFibonacci(fibNum - 2);
    }
    public long getFibonnacciEff(long fibNum){
        numInvocations++;
        if(fibNum == 0 || fibNum == 1){
            return fibNum;
        }

        Long fibNumMinus1 = chachedFibs.get(new Long(fibNum -1));
        if (fibNumMinus1 == null){
            fibNumMinus1 = getFibonnacciEff(fibNum - 1);
        }
        Long fibNumMinus2 = chachedFibs.get(new Long(fibNum - 2));
        if(fibNumMinus2 == null){
            fibNumMinus2= getFibonnacciEff(fibNum -2);
        }
        chachedFibs.put(fibNum, fibNumMinus1 + fibNumMinus2);
        return fibNumMinus1 + fibNumMinus2;

    }
//    public int number1=0,number2=1, number3 =0;
//
//    public void printFibonacci(int count){
//        if(count>0){
//            number3 = number1 + number2;
//            number1 = number2;
//            number2 = number3;
//            System.out.print(" "+ number3);
//            printFibonacci(count-1);
//        }
//    }
//    public void fiboOut(){
//        int count=10;
//        System.out.print(number1+" "+number2);//printing 0 and 1
//        printFibonacci(count-2);//count-2 because 2 numbers are already printed
//    }

}
