
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");

        int endingNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");

        int startingNum = Integer.valueOf(scanner.nextLine());

        if (endingNum >= startingNum) {
            for (int i = startingNum; i <= endingNum; i++) {
                System.out.println(i);
            }
        }
    }
}
