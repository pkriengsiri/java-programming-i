
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        
        //Write a program that reads names and ages from the user until an empty line is entered. The name and age are separated by a comma.

        //After reading all user input, the program prints the age of the oldest person. You can assume that the user enters at least one person, and that one of the users is older than the others.
        
        Scanner scanner = new Scanner(System.in);
        
        // track the oldest age in a variable
        int age = 0;
        
        while(true) {
            // prompt for input
            String input = scanner.nextLine();
            
            // end if an empty line is entered
            if(input.equals("")) {
                break;
            }
            
            // get the from the current input
            int inputAge = Integer.valueOf(input.split(",")[1]);
            
            // compare it to the tracked age
            if(inputAge > age) {
                age = inputAge;
            }
        }
        
        System.out.println("Age of the oldest: "+age);
                


    }
}
