import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by RdDvls on 9/27/16.
 */
public class SortTest {
    BaseSorter sortingRunner = new SelectionSorter();

    private void assert3ElementOrder(int[] numArray) {
        assertEquals(5, numArray[0]);
        assertEquals(7, numArray[1]);
        assertEquals(19, numArray[2]);
    }
    private void assert4ElementOrder(int [] numArray){
        assertEquals(5, numArray[0]);
        assertEquals(7, numArray[1]);
        assertEquals(19, numArray[2]);
        assertEquals(32, numArray[3]);
    }
    private void assertSelectionSortOrder(int [] numArray){
        assertEquals(-3,numArray[0]);
        assertEquals(0, numArray[1]);
        assertEquals(1, numArray[2]);
        assertEquals(5, numArray[3]);
        assertEquals(9, numArray[4]);
    }

    @Before
    public void setUp() throws Exception{
    }

    @After
    public void tearDown() throws Exception{
    }

    @Test
    public void bubbleSort3ElementArray() throws Exception {
        int[] orderedArray = {5, 7, 19};
        sortingRunner.sort(orderedArray);
        assert3ElementOrder(orderedArray);
        System.out.println("***");

        int[] scrambledArray1 = {5, 19, 7};
        sortingRunner.sort(scrambledArray1);
        assert3ElementOrder(scrambledArray1);
        System.out.println("***");

        int[] scrambledArray2 = {7, 5, 19};
        sortingRunner.sort(scrambledArray2);
        assert3ElementOrder(scrambledArray2);
        System.out.println("***");


        int[] scrambledArray3 = {7, 19, 5};
        sortingRunner.sort(scrambledArray3);
        assert3ElementOrder(scrambledArray3);
        System.out.println("***");


        int[] scrambledArray4 = {19, 7, 5};
        sortingRunner.sort(scrambledArray4);
        assert3ElementOrder(scrambledArray4);
        System.out.println("***");


    }

    @Test
    public void bubbleSort4ElementArray()throws Exception{
        int[] orderedArray = {5,7,19,32};
        sortingRunner.sort(orderedArray);
        assert4ElementOrder(orderedArray);
        System.out.println("~~~~");

        int[] scrambledArray1 = {5,19,7,32};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("~~~~");

        int[] scrambledArray2 = {5,19,32,7};
        sortingRunner.sort(scrambledArray2);
        assert4ElementOrder(scrambledArray2);
        System.out.println(scrambledArray2);


    }
    @Test
    public void selectionSortTest()throws Exception{
        int[] arrayToSort = {0,-3,5,1,9};
        sortingRunner.sort(arrayToSort);
        assertSelectionSortOrder(arrayToSort);
    }
    @Test
    public void shouldDoNothingWithOneElementArray() {
        int[] values = {42};

        sortingRunner.sort(values);

        assertArrayEquals(new int[] {42}, values);
    }
    @Test
    public void shouldDoNothingWithEmptyArray() {
        int[] values = {};

        sortingRunner.sort(values);
    }


}
