import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write test code here
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        System.out.println(Arrays.toString(values));
        swap(values, 0, 2);
        System.out.println(Arrays.toString(values));
    }

    public static int smallest(int[] arr) {
        int smallest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                smallest = arr[i];
            }
            smallest = smallest < arr[i] ? smallest : arr[i];
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] arr) {
        int smallest = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                smallest = arr[i];
                index = i;
            }
            smallest = smallest < arr[i] ? smallest : arr[i];
            index = smallest < arr[i] ? index : i;
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] arr, int index) {
        int smallest = 0;
        int ind = 0;
        for (int i = index; i < arr.length; i++) {
            if (i == index) {
                smallest = arr[index];
                ind = index;
            }
            smallest = smallest < arr[i] ? smallest : arr[i];
            ind = smallest < arr[i] ? ind : i;
        }
        return ind;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = indexOfTheSmallestStartingFrom(arr, i);
            swap(arr, i, index);
        }
    }
}


