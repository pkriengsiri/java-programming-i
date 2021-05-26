
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        
        int input = Integer.valueOf(scanner.nextLine());
        
        int result = input*60*60*24;
        
        System.out.println(result);

    }
}
