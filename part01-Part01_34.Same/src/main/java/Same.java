
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String x = scan.nextLine();
        String y = scan.nextLine();
        if(x.equals(y)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    
    }
}
