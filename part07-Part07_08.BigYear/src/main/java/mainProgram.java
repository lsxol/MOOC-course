
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {
        static Scanner scan = new Scanner(System.in);
        static ArrayList<Bird> birds = new ArrayList<>();
    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        while(true){
            System.out.println("?");
            String command = scan.nextLine();
            if(command.equals("Quit")){
                break;
            }
            if(command.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latin = scan.nextLine();
                birds.add(new Bird(name, latin));
            }
            if(command.equals("Observation")){
                String name = scan.nextLine();
                mainProgram.observation(name); 
            }
            if(command.equals("All")){
                for(int i = 0; i < birds.size(); i++){
                    System.out.println(birds.get(i).toString());
                }
            }
            if(command.equals("One")){
                System.out.println("Bird?");
                String name = scan.nextLine();
                for(int i = 0; i < birds.size(); i++){
                    if(birds.get(i).getName().equals(name)){
                        System.out.println(birds.get(i).toString());
                    }
                }
            }
        }
     
    }
    
    public static void observation(String name){
        for(int i = 0; i < birds.size(); i++){
            if(birds.get(i).getName().equals(name)){
                birds.get(i).addObservation();
            }
        }
    }

}
