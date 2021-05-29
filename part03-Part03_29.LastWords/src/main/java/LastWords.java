
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write a program that reads user input until an empty line is entered. For each non-empty line the program splits the string by spaces and prints the last part of the string.
        
        while(true) {
            
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            String[] inputArr = input.split(" ");
            
            System.out.println(inputArr[inputArr.length-1]);
        }

    }
}
