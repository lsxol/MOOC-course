
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String x = scanner.nextLine();
            if(x.equals("")){
                break;
            }
            String[] array = x.split(" ");
            System.out.println(array[array.length - 1]);
        }

    }
}
