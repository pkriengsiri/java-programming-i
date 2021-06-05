
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();
        
        while (true) {
            System.out.println("First: "+container1);
            System.out.println("Second: "+container2);

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] inputArr = input.split(" ");
            String command = inputArr[0];
            int amount = Integer.valueOf(inputArr[1]);
            
            switch(command) {
                case "remove": {
                    container2.remove(amount);
                    break;
                }
                case "add": {
                    container1.add(amount);
                    break;
                }
                case "move": {
                    if(container1.contains() > amount) {
                        container1.remove(amount);
                        container2.add(amount);
                    } else {
                        int toMove = container1.contains();
                        container1.remove(toMove);
                        container2.add(toMove);
                    }
                    break;
                }
                default: {
                    System.out.println("Something went wrong");
                }
            }

        }
    }

}
