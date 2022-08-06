import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeHandling recipes = new RecipeHandling();
        UI ui = new UI(recipes,scanner);
        ui.start();
    }

}
