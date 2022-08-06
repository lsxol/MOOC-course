
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class Stack {
   
    private ArrayList<String> strings;

    public Stack() {
        this.strings = new ArrayList();
    }

    public ArrayList<String> getStrings() {
        return strings;
    }
    
    public boolean isEmpty(){
        if(this.strings.size()==0){
            return true;
        }else{
            return false;
        }
    }
    
    public void add(String value){
        if(!this.strings.contains(value)){
            this.strings.add(value);
        }
    }
    
    public ArrayList<String> values(){
        return this.strings;
    } 
    
    public String take(){
        String dupa = this.strings.get(this.strings.size()-1);
        this.strings.remove(this.strings.size()-1);
        return dupa;
    }
    
    
}
