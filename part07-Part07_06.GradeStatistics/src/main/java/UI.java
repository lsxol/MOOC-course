
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
    private Points points;
    private Scanner scanner;

    public UI(Points points, Scanner scanner) {
        this.points = points;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            int add = Integer.valueOf(scanner.nextLine());
            if(add == -1){
                break;
            }
            points.add(add);
        }
        points.average();
        points.passingAverage();
        points.passPercentage();
        points.gradeDistribution();
    
    
    }
}