
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics userStatistics1 = new Statistics();
        Statistics userStatistics2 = new Statistics();
        Statistics userStatistics3 = new Statistics();
        
        System.out.println("Enter numbers: ");
        
        while(true) {

            
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1) {
                break;
            }
            
            userStatistics1.addNumber(input);
            
            if(input %2 ==0 ) {
                userStatistics2.addNumber(input);
            } else {
                userStatistics3.addNumber(input);
            }
        }
        
        System.out.println("Sum: "+userStatistics1.sum());
        System.out.println("Sum of even numbers: "+userStatistics2.sum());
        System.out.println("Sum of odd numbers: "+userStatistics3.sum());
    }
}
