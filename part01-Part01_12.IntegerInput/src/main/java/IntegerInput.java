
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        
        // get the input and store it in an integer variable
        int number = Integer.valueOf(scanner.nextLine());
        
        // print the number
        System.out.println("You gave the number "+number);

    }
}
