
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
public class Package {
    
    private ArrayList<Gift> gifts = new ArrayList<>();

    
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    
    public int totalWeight(){
        int all = 0;
        for(Gift gift:this.gifts){
            all = all + gift.getWeight();
        }
        return all;
    }
    
}
