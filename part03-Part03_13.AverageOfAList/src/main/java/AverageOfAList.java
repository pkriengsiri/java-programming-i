
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> numbersArr = new ArrayList<>();
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1) {
                break;
            }
            
            numbersArr.add(input);
        }
        
        int sum = 0;
        int numbers = numbersArr.size();
        
        for(int number : numbersArr) {
            sum += number;
        }
        
        double average = 1.0*sum/numbers;
        
        System.out.println("Average: "+average);
                
        
        
    }
}
