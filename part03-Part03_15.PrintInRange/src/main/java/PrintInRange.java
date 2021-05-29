
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        printNumbersInRange(numbers, 0, 7);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range [" + lowerLimit + "," + upperLimit + "]");
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber >= lowerLimit && currentNumber <= upperLimit) {
                System.out.println(numbers.get(i));
            }
        }

    }
}
