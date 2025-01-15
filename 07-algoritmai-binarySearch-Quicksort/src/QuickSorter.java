import java.util.Arrays;

public class QuickSorter {
    private int[] array;

    public QuickSorter(int[] array) {
        this.array = array;
    }

    public void quicksort() {
        quicksort(0, array.length - 1);
    }

    public void quicksort(int startIdx, int endIdx) {

        if (startIdx < endIdx) {
            int pivot = (startIdx + endIdx) / 2;
            int temp = array[pivot];
            array[pivot] = array[endIdx];
            array[endIdx] = temp;
            int swapPos = startIdx;
            for (int i = startIdx; i < endIdx; i++) {
                if (array[i] < array[endIdx]) {
                    int temporary = array[swapPos];
                    array[swapPos] = array[i];
                    array[i] = temporary;
                    swapPos++;
                }
            }
            temp = array[swapPos];
            array[swapPos] = array[endIdx];
            array[endIdx] = temp;
            quicksort(startIdx, swapPos - 1);
            quicksort(swapPos + 1, endIdx);
        }
    }

    public String toString() {
        return Arrays.toString(array);
    }
}

