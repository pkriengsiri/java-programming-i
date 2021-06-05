import java.util.Scanner;

import java.util.ArrayList;

public class UserInterface {
    
    private Scanner scanner;
    private BirdDatabase sightings;
    
    public UserInterface(BirdDatabase sightings, Scanner scanner) {
        this.scanner = scanner;
        this.sightings = sightings;
    }
    
    public void start() {
        while(true) {
            System.out.print("? ");
            
            String command = scanner.nextLine();
            
            if(command.equals("Quit")) {
                break;
            }
            
            switch(command) {
                case "Add": {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    String latinName = scanner.nextLine();
                    Bird bird = new Bird(name, latinName);
                    this.sightings.add(bird);
                    break;
                }
                case "Observation": {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    this.sightings.observe(name);
                    break;
                }
                case "All": {
                    this.sightings.all();
                    break;
                }
                case "One": {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    this.sightings.one(name);
                    break;
                }
                default: {
                    System.out.println("Unknown command");
                }
            }
        }
    }
    
}
