
import java.util.ArrayList;

class RecipeBook {

    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        recipes.add(recipe);
    }

    public void list() {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
        System.out.println("");
    }

    public void findByName(String search) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(search)) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }

    public void findByCookTime(int search) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookTime() <= search) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }

    public void findByIngredient(String search) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(search)) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }
}
