
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
public class Points {
    private ArrayList<Integer> points = new ArrayList<>();
    
    public void add(int add){
        if(add >= 0 && add <= 100){
            this.points.add(add);
        }
    }
    public void average(){
        int sum = 0;
        for(int i = 0; i < this.points.size(); i++){
            sum = sum + this.points.get(i);
        }
        if(sum > 0){
            System.out.println("Point average (all): " + 1.0*sum/this.points.size());
        }else{
            System.out.println("Point average (all):-");
        }
    }
    public void passingAverage(){
        
        int sum = 0;
        int count = 0;
        for(int i = 0; i < this.points.size(); i++){
            if(this.points.get(i) >= 50){
                sum = sum + this.points.get(i);
                count++;
            }
        }
        if(sum > 0){
            System.out.println("Points average (passing): " + 1.0*sum/count);
        }else{
            System.out.println("Points average (passing):-");
        }

    }
    public void passPercentage(){
        int count = 0;
        
        for(int i = 0; i < this.points.size(); i++){
            if(this.points.get(i) >= 50){
                count++;
            }
        }
        if(this.points.size() > 0){
            System.out.println("Pass percentage: " + 100.0*count/this.points.size());
        }else{
            System.out.println("Pass percentage:-");
        }
        
    }
    
    private void printStars(int k, int n){
        System.out.print(k + ": ");
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public void gradeDistribution(){
        int[] array = new int[6];
        for(int i = 0; i < this.points.size(); i++){
            if(this.points.get(i) >= 50 && this.points.get(i) < 60 ){
                array[1]++;
            }
            else if(this.points.get(i) >= 60 && this.points.get(i) < 70 ){
                array[2]++;
            }
            else if(this.points.get(i) >= 70 && this.points.get(i) < 80 ){
                array[3]++;
            }
            else if(this.points.get(i) >= 80 && this.points.get(i) < 90 ){
                array[4]++;
            }
            else if(this.points.get(i) >= 90){
                array[5]++;
            }else{
                array[0]++;
            }
    
        }
        for(int i = 0; i < array.length; i++){
            this.printStars(i, array[i]);
        }
    }
        
        
}

