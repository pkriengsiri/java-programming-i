
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
//        Write a program that reads strings from the user. If the input is empty, the program stops reading input and halts. For each non-empty input it splits the string input by whitespaces and prints each part of the string on a new line.

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] stringSplit = input.split(" ");

            for (int i = 0; i < stringSplit.length; i++) {
                System.out.println(stringSplit[i]);
            }
        }

    }

}
