
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {

        this.list = list;
        this.scanner = scanner;

    }

    public void start() {
        while (true) {
            System.out.println("Command:");

            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "add": {
                    this.add();
                    break;
                }
                case "list": {
                    this.list();
                    break;
                }
                case "remove": {
                    this.remove();
                    break;
                }
                default: {
                    System.out.println("Unknown command");
                }
            }
        }
    }

    public void add() {
        System.out.println("To add:");

        String task = scanner.nextLine();

        this.list.add(task);
    }

    public void list() {
        this.list.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed?");
        
        int number = Integer.valueOf(scanner.nextLine());
        
        this.list.remove(number);
    }

}
