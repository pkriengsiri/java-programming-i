
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantity1 = 0;
        int quantity2 = 0;

        while (true) {
            System.out.println("First: " + quantity1 + "/100");
            System.out.println("Second: " + quantity2 + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputArr = input.split(" ");

            if (inputArr[0].equals("add")) {
                int add = Integer.valueOf(inputArr[1]);
                if (add > 0) {
                    quantity1 += add;
                    if (quantity1 > 100) {
                        quantity1 = 100;
                    }
                }
            }

            if (inputArr[0].equals("move")) {
                int move = Integer.valueOf(inputArr[1]);
                
                if(move < 0) {
                    move = 0;
                }

                if (move <= quantity1) {
                    quantity1 -= move;
                    quantity2 += move;
                    if (quantity2 >= 100) {
                        quantity2 = 100;
                    }
                } else {
                    move = quantity1;
                    quantity1 = 0;
                    quantity2 += move;
                    if (quantity2 >= 100) {
                        quantity2 = 100;
                    }
                }
            }
            
            if(inputArr[0].equals("remove")) {
                int remove = Integer.valueOf(inputArr[1]);
                
                if (remove < 0) {
                    remove = 0;
                }
                
                if (remove > quantity2) {
                    quantity2 = 0;
                } else {
                    quantity2 -= remove;
                }
                
                
            }
        }

    }
}


