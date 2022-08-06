
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldAge = 0;
        int age = 0;
        while(true){
            String x = scanner.nextLine();
            if(x.equals("")){
                break;
            }
            String[] array = x.split(",");
            age = Integer.valueOf(array[1]);
            if(oldAge<age){
                oldAge = age;
            }
            
        }
        System.out.println("Age of the oldest: " + oldAge);
    }
}
