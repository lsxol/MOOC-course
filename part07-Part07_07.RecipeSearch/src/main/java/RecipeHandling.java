
import java.nio.file.Paths;
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
public class RecipeHandling {

    private ArrayList<Recipe> recipes = new ArrayList<>();
    private String fileName;

    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void readValuesRecipe(){
        String recipe = "";
        
        try(Scanner scanner = new Scanner(Paths.get(this.fileName))){
            while(scanner.hasNext()){
               recipe = scanner.nextLine() + "," + recipe;
            }
            
            String[] split = recipe.split("\n");

            String[] split2 = split[0].split(",,");
            
            for(int i = 0; i < split2.length; i++){
                
                String[] split3 = split2[i].split(",");
                if(i < split2.length - 1){
                    ArrayList<String> ingr = new ArrayList<>();
                    ingr.clear();
                    String name = split3[split3.length-1];
                    int time = Integer.valueOf(split3[split3.length-2]);
                    for(int j = 0; j < split3.length - 2; j++){
                        ingr.add(split3[j]);
                    }
                    this.recipes.add(new Recipe(name,time,ingr));
                }else if(i == split2.length - 1){
                    ArrayList<String> ingr = new ArrayList<>();
                    ingr.clear();
                    String name = split3[split3.length-1];
                    int time = Integer.valueOf(split3[split3.length-2]);
                    for(int j = 0; j < split3.length - 2; j++){
                        ingr.add(split3[j]);
                    }
                    this.recipes.add(new Recipe(name,time,ingr));
                    
                }
            }
           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
    public void print(){
            for(int i = 0; i < this.recipes.size(); i++){
                System.out.println(this.recipes.get(i).toString());
            }
        }
    
    public boolean findByName(String find){
        boolean bool = false;
        for(int i = 0; i < this.recipes.size(); i++){
            if(this.recipes.get(i).getRecipeName().contains(find)){
                this.printByIndex(i);
                bool = true;
            }
            
        }
        return bool;
    }
    
    public boolean findByCookingTime(int time){
        boolean bool = false;
        for(int i = 0; i < this.recipes.size(); i++){
            if(this.recipes.get(i).getCookingTime() <= time){
                this.printByIndex(i);
                bool = true;
            }
            
        }
        return bool;
    }
    
    public boolean findByIngredients(String ingr){
        boolean bool = false;
        for(int i = 0; i < this.recipes.size(); i++){
            if(this.recipes.get(i).findIngredient(ingr)){
                this.printByIndex(i);
                bool = true;
            }
            
        }
        return bool;
    }
   
    public void printByIndex(int index){
        System.out.println(this.recipes.get(index).toString());
    }
    
    public boolean empty(){
        if(this.recipes.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
