package lt.techin.praktinis;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysTask2D {

    /**
     * Returns the maximum value in the 2D array arr.
     *
     * @param arr The 2D array to be processed.
     * @return The maximum value in the array.
     */
    public static int max(int[][] arr) {
//        throw new UnsupportedOperationException();
        int maximumValue = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int i : row) {
                maximumValue = Math.max(maximumValue, i);
            }
        }
        return maximumValue;
    }

    /**
     * Returns the sum of the elements in Row x of arr.
     *
     * @param arr The 2D array to be processed.
     * @param x   The row index.
     * @return The sum of elements in the specified row.
     */
    public static int rowSum(int[][] arr, int x) {
        int sum = 0;
        for (int num : arr[x]) {
            sum += num;
        }
        return sum;
    }

    /**
     * Returns the sum of the elements in Column x of arr.
     *
     * @param arr The 2D array to be processed.
     * @param x   The column index.
     * @return The sum of elements in the specified column.
     */
    public static int columnSum(int[][] arr, int x) {
        int sum = 0;
        for (int[] row : arr) {
            for (int i = 0; i < row.length; i++) {
                if (i == x) {
                    sum += row[i];
                }
            }
        }
        return sum;
    }

    public static int allColumnSum(int[][] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += columnSum(arr, j);
        }
        return sum;
    }

    /**
     * Calculates the row sum for every row in arr and returns each of the values in an array.
     *
     * @param arr The 2D array to be processed.
     * @return An array containing the sum of elements in each row.
     */
    public static int[] allRowSums(int[][] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            result[i] = sum;
        }
        return result;
    }

    public static int allRowSumsInt(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    /**
     * Checks if the array arr is row-magic, which means that every row has the same row sum.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is row-magic, false otherwise.
     */
    public static boolean isRowMagic(int[][] arr) {
        int firstValue = allRowSums(arr)[0];
        for (int value : allRowSums(arr)) {
            if (value != firstValue) return false;
        }
        return true;
    }

    /**
     * Checks if the array arr is column-magic, which means that every column has the same column sum.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is column-magic, false otherwise.
     */
    public static boolean isColumnMagic(int[][] arr) {
        int firstValue = columnSum(arr, 0);
        for (int[] row : arr) {
            for (int i = 1; i < row.length; i++) {
                if (columnSum(arr, 0) != columnSum(arr, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if the array arr is square, i.e., every row has the same length as arr itself.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is square, false otherwise.
     */
    public static boolean isSquare(int[][] arr) {
        for (int[] row : arr) {
            if (row.length != arr.length) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the array arr is a magic square, meaning it is square, and all row sums, column sums,
     * and the two diagonal-sums are equal.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a magic square, false otherwise.
     */
    public static boolean isMagic(int[][] arr) {
        return isRowMagic(arr) && isColumnMagic(arr) && isSquare(arr);
    }

    /**
     * Checks to see if the array arr is a Latin square, meaning it must be square, and each row and each column
     * must contain the values 1, 2, ..., n with no repeats.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a Latin square, false otherwise.
     */
    public static boolean isLatin(int[][] arr) {
        if (arr.length == 1 && arr[0].length == 1) {
            return true;
        }
        if (!isSquare(arr)) return false;
        return isRowMagic(arr) && isColumnMagic(arr) && allRowSumsInt(arr) == allColumnSum(arr);
    }

    /**
     * Checks to see if the array arr is square and contains each of the digits from 1 to n*n, e.g., 1, 2, ..., 16 for a 4 x 4 array.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a sequence, false otherwise.
     */
    public static boolean isSequence(int[][] arr) {
        if (!isSquare(arr)) return false;
        int sum = 0;
        for (int i = 1; i <= arr.length * arr.length; i++) {
            sum += i;
        }
        return allRowSumsInt(arr) == sum;
    }


}
