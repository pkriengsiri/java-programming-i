
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Arrays;

public class UserInterface {

    private RecipeBook recipes;
    private Scanner scanner;

    public UserInterface(RecipeBook recipes, Scanner scanner) {
        this.recipes = recipes;
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("File to read:");

        String file = scanner.nextLine();

        this.processFile(file);
        
        System.out.println("");
        
        System.out.println("Commands:\n"
                    + "list - lists the recipes\n"
                    + "stop - stops the program\n"
                    + "find name - searches recipes by name\n"
                    + "find cooking time - searches recipes by cooking time\n"
                    + "find ingredient - searches recipes by ingredient");
            
            System.out.println("");

        while (true) {

            System.out.print("Enter Command: ");

            String command = scanner.nextLine();
            

            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "list": {
                    
                    recipes.list();
                    System.out.println("");
                    break;
                }
                case "find name": {
                    System.out.print("Searched word: ");
                    String search = scanner.nextLine();
                    this.recipes.findByName(search);
                    break;
                }
                case "find cooking time": {
                    System.out.print("Max cooking time: ");
                    int search = Integer.valueOf(scanner.nextLine());
                    this.recipes.findByCookTime(search);
                    break;
                }
                case "find ingredient": {
                    System.out.print("Ingredient: ");
                    String search = scanner.nextLine();
                    recipes.findByIngredient(search);
                    break;
                }
                default: {
                    System.out.println("Unknown command");
                }
            }
        }
    }

    private void processFile(String file) {
        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            String fileString = "";
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                if (row.isEmpty()) {
                    fileString += "X";
                    continue;
                }

                fileString += row + ",";
            }

            String[] fileStringArr = fileString.split("X");

            for (int i = 0; i < fileStringArr.length; i++) {
                String[] recipeString = fileStringArr[i].split(",");
                String name = recipeString[0];
                int cookTime = Integer.valueOf(recipeString[1]);

                ArrayList<String> ingredients = new ArrayList<>();

                for (int j = 2; j < recipeString.length; j++) {

                    ingredients.add(recipeString[j]);
                }

                Recipe recipe = new Recipe(name, cookTime, ingredients);

                recipes.add(recipe);
            }

        } catch (Exception e) {
            System.out.println("Error reading the file");
        }
    }
}
