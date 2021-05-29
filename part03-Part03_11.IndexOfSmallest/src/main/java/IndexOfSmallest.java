
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input != 9999) {
                numbers.add(input);
            } else {
                break;
            }
        }
        
        int smallest = numbers.get(0);
        
        for(int number: numbers) {
            if(number < smallest) {
                smallest = number;
            }
        }
        
        System.out.println("Smallest number: "+smallest);
        
        int index = 0;
        
        for(int number: numbers) {
            if(number == smallest) {
                System.out.println("Found at index: "+index);
            }
            index++;
        }
        
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
