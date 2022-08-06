/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class Figures {
    
    private String name;
    private String id;

    public Figures(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public boolean equals(Object figure){
        if(this == figure){
            return true;
        }
        if(!(figure instanceof Figures)){
            return false;
        }
        Figures comparedFigure = (Figures) figure;
        return this.id.equals(comparedFigure.id);
    }
    @Override
    public String toString(){
        return this.id + ": " + this.name;
    }
    
}
