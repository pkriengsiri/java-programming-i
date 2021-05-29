
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        // Write a program that reads names and birth years from the user until an empty line is entered. The name and birth year are separated by a comma.

        // After that the program prints the longest name and the average of the birth years. If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.
        
        Scanner scanner = new Scanner(System.in);
        
        int nameLength = -1;
        String name = "";
        int sumYear = 0;
        int count = 0;
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            String currentName = input.split(",")[0];
            
            int currentYear = Integer.valueOf(input.split(",")[1]);
            
            sumYear += currentYear;
            count ++;
            
            if(currentName.length() > nameLength) {
                name = currentName;
                nameLength = currentName.length();
            }
            
            
        }
        
        System.out.println("Longest Name: "+name);
        System.out.println("Average of birth years: "+((double)sumYear/count));


    }
}
