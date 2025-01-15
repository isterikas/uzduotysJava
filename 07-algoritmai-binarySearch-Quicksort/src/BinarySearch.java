public class BinarySearch {
    private int[] array;
    private int key;
    private int fromIdx;
    private int toIdx;


    public BinarySearch(int[] array, int key) {
        this.array = array;
        this.key = key;
        fromIdx = 0;
        toIdx = array.length - 1;
    }

    public BinarySearch(int[] array, int key, int fromIdx, int toIdx) {
        this.array = array;
        this.key = key;
        this.fromIdx = fromIdx;
        this.toIdx = toIdx;
    }

    public String searchForValue() {
        String result = binarySearch() ? " is present in the given array." : " is not present in the given array.";
        return "Number " + key + result;
    }

    private boolean binarySearch() {
        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return true;
            } else return false;
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }

        }
        return binarySearch();
    }
}

