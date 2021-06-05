
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int smallest = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                index = i;
                smallest = table[i];
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        //int swaps = 0;
        
        System.out.println(array.length);

//        while (swaps < 1) {
//            int smallestIndex = indexOfSmallestFrom(array, swaps);
//            swap(array, array[swaps], array[smallestIndex]);
//            System.out.println(Arrays.toString(array));
//            swaps++;
//        }
        for(int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }

    }

}
