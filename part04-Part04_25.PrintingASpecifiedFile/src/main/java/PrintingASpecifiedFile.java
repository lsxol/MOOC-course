
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("which file should have its contents printed");
        String file = scanner.nextLine();
        try (Scanner scanFile = new Scanner (Paths.get(file))){
            
            while(scanFile.hasNext()){
                String song = scanFile.nextLine();
                System.out.println(song);
            }
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
