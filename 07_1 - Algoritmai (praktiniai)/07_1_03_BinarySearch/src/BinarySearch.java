public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        if (searchedValue < array[beginning] || searchedValue > array[end]) {
            return false;
        }
        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            } else if (array[middle] > searchedValue) {
                end = middle - 1;
            } else beginning = middle + 1;

            // restrict the search area
        }
        return false;
    }
}
