
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
public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = this.scanner.nextLine();
            if(command.equals("X")){
                break;
            }
            switch(command){
                case "1":
                    System.out.println("Write a joke to be added");
                    String joke = this.scanner.nextLine();
                    this.jokes.addJoke(joke);
                    break;
                case "2":
                    System.out.println(this.jokes.drawJoke());
                    break;
                case "3": 
                    this.jokes.printJokes();
                    break;
                default:
                    System.out.println("unknown commend");
                    break;
            }
            
        }
    }
    
}

