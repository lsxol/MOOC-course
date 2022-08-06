
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
public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){
        this.people.add(person);
        
    }
    
    public boolean isEmpty(){
        return this.people.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if(this.people.isEmpty()){
            return null;
        }
        
        Person returnPrs = this.people.get(0);
        
        for(Person prs:this.people){
            if(returnPrs.getHeight()>prs.getHeight()){
                returnPrs = prs;
            }
        }
        return returnPrs;
    }
    
    public Person take(){
        if(this.people.isEmpty()){
            return null;
        }
        
        Person prs = this.shortest();
        System.out.println(prs);
        this.people.remove(this.shortest());
        return prs;
    }
}
