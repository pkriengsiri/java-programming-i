
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        
        String stringOne = scan.nextLine();
        
        System.out.println("Enter the second string:");
        
        String stringTwo = scan.nextLine();
        
        String message = stringOne.equals(stringTwo) ? "Same" : "Different";
        
        System.out.println(message);
    }
}
