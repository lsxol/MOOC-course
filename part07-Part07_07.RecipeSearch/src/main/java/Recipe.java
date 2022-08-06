import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients = new ArrayList<>();

    public Recipe(){
        
    }
    
    public Recipe(String recipeName, int cookingTime, ArrayList<String> array) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = array;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }


    public void addIngedient(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public boolean findIngredient(String ingr){
        
        return this.ingredients.contains(ingr);
  
    }
    
    @Override
    public String toString(){
        return this.recipeName + ", cooking time: " + this.cookingTime;
    }
    
    
    
    
    
}
