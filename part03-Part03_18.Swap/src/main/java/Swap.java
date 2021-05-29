
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them
        int index1 = Integer.valueOf(scanner.nextLine());
        int index2 = Integer.valueOf(scanner.nextLine());
        
        // create a variable to store a value during the swap
        int helper = array[index1];
        // swap value at first index with value at second
        array[index1] = array[index2];
        // swap value at second index with the previous value from first (stored in the helper)
        array[index2] = helper;

        System.out.println("");
        
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
