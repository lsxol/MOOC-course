
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String fileName = scan.nextLine();
        
        System.out.println("Name: ");
        String teamName = scan.nextLine();
        int playCounter = 0;
        int winCounter = 0;
        int lossesCounter = 0;
        try(Scanner scanFile = new Scanner(Paths.get(fileName))){
            while(scanFile.hasNext()){
                String line = scanFile.nextLine();
                String[] parts = line.split(",");
                String firstTeam = parts[0];
                String secondTeam = parts[1];
                int firstTeamPoints = Integer.valueOf(parts[2]);
                int secondTeamPoints = Integer.valueOf(parts[3]);
                
                if(firstTeam.equals(teamName)){
                    playCounter++;
                    if(firstTeamPoints > secondTeamPoints){
                        winCounter++;
                    }else{
                        lossesCounter++;
                    }   
                }
                if(secondTeam.equals(teamName)){
                    playCounter++;
                    if(firstTeamPoints < secondTeamPoints){
                        winCounter++;
                    }else{
                        lossesCounter++;
                    }   
                }

            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Games: " + playCounter);
        System.out.println("Wins: " + winCounter);
        System.out.println("Losses: " + lossesCounter);
    }

}
