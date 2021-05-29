
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }

//    Create the method public static void removeLast(ArrayList<String> strings) in the exercise template. The method should remove the last value in the list it receives as a parameter. If the list is empty, the method does nothing.
    public static void removeLast(ArrayList<Integer> numbers) {
        // check to see if the array is empty
        if (numbers.size() == 0) {
            // do nothing 
            return;
        }

        // get the index of the last element in the array
        int lastElement = numbers.size() - 1;

        // remove the last element
        numbers.remove(lastElement);
    }

}
