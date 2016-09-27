/**
 * Created by RdDvls on 9/27/16.
 */
public class SelectionSorter extends BaseSorter{
    @Override
    public int[] sort(int[] arrayToSort) {
        for(int counter = 0; counter < arrayToSort.length; counter ++){
            int index = counter;
                for(int elementIndex = counter + 1; elementIndex < arrayToSort.length; elementIndex++){
                    if(arrayToSort[elementIndex]< arrayToSort[index]){
                        index = elementIndex;
                        int smallerNumber = arrayToSort[index];
                        arrayToSort[index] = arrayToSort[counter];
                        arrayToSort[counter] = smallerNumber;
                    }
                    printNumbers(arrayToSort);
                }
        }
        return arrayToSort;
    }

}
