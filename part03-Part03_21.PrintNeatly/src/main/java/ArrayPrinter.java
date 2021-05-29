
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

//    Complete the method public static void printNeatly(int[] array) in the class named 'ArrayPrinter' to make it print the numbers of the array it receives more neatly. There should be a whitespace and a comma between each number. don't put a comma after the last number.
    public static void printNeatly(int[] array) {
        // Write some code in here
        int counter = 0;

        for (int number : array) {
            if (counter == array.length - 1) {
                System.out.print(number);
            } else {
                System.out.print(number + ", ");
                counter++;
            }
        }

    }
}

