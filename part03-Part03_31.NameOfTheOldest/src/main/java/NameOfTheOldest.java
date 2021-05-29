
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        
        // Write a program that reads names and ages from the user until an empty line is entered. The name and age are separed by a comma.
        
        // After reading all user input, the program prints the name of the oldest person. You can assume that the user enters at least one person, and the that one of the users is older than the others.
        
        Scanner scanner = new Scanner(System.in);
        
        // track the oldest's age in a variable
        int age = 0;
        
        // track the oldest's name in a variable
        String name = "";
        
        while(true) {
            // prompt for input
            String input = scanner.nextLine();
            
            // end if an empty line is entered
            if(input.equals("")) {
                break;
            }
            
            // get age the from the current input
            int inputAge = Integer.valueOf(input.split(",")[1]);
            
            // get the name from the current input
            String inputName = input.split(",")[0];
            
            // compare it to the tracked age
            if(inputAge > age) {
                // update the tracked age and name if older
                age = inputAge;
                name = inputName;
            }
        }
        
        System.out.println("Name of the oldest: "+name);
        
        


    }
}
