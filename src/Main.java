import java.util.Arrays;

public class Main {
    private static final int MIN = 1;
    private static final int MAX = 1000;
    private static final int CAPACITY = 100;
    private static final int TARGET = 44;

    public static void main(String[] args) {
        int[] array = ArrayUtils.generateRandomArray(CAPACITY, MIN, MAX);

        int[] sortedArray = ArrayUtils.mergeSort(array);
        System.out.println(Arrays.toString(sortedArray));

        int index = ArrayUtils.binarySearch(sortedArray, TARGET);
        System.out.println(index);
    }
}
