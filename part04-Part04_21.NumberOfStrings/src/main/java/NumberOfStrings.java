
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while(true){
            
            String x = scanner.nextLine();
            
            if(x.equals("end")){
                break;
            }
            
            counter++;
        }
        
        System.out.println(counter);
    }
}
