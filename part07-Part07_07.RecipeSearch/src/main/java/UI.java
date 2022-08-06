
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class UI {
    private RecipeHandling recipes;
    private Scanner scanner;

    public UI(RecipeHandling recipes, Scanner scanner) {
        this.recipes = recipes;
        this.scanner = scanner;
    }
    
    
    
    public void start(){
        
        System.out.println("File to read:");
        recipes.setFileName(this.scanner.nextLine());
        this.recipes.readValuesRecipe();
        
        while(this.recipes.empty()){
            System.out.println("File to read:");
            recipes.setFileName(this.scanner.nextLine());
            this.recipes.readValuesRecipe();
        }
        
        
        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - seraches recipes by ingredient");
        while(true){
            System.out.println("");
            System.out.println("Enter command");
            String command = this.scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            if(command.equals("list")){
                this.recipes.print();
            }
            if(command.equals("find name")){
                System.out.println("Searched word: ");
                String searched = this.scanner.nextLine();
                if(!this.recipes.findByName(searched)){
                    System.out.println("not found");
                } 
            }
            if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int searched = Integer.valueOf(this.scanner.nextLine());
                if(!this.recipes.findByCookingTime(searched)){
                    System.out.println("not found");
                }
            }
            if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String searched = this.scanner.nextLine();
                if(!this.recipes.findByIngredients(searched)){
                    System.out.println("not found");
                }
            }
        }
    }
}
