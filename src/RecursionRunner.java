/**
 * Created by RdDvls on 9/27/16.
 */
public class RecursionRunner {
    public static void main(String[] args) {
        System.out.println("Running ...");
        RecursionRunner runner = new RecursionRunner();
        runner.recursionTest(0, 8);
    }

    public int recursionTest(int count, int max) {
        System.out.print(count +" ");
        if (count >= max) {
            return count;
        }
        return recursionTest(count + 1, max);
    }

}
