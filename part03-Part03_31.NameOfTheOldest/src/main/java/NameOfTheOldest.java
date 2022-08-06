
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldAge = 0;
        int age = 0;
        String name = "";
        String oldName = "";
        while(true){
            String x = scanner.nextLine();
            if(x.equals("")){
                break;
            }
            String[] array = x.split(",");
            name = array[0];
            age = Integer.valueOf(array[1]);
            if(oldAge<age){
                oldAge = age;
                oldName = name;
            }
            
        }
        System.out.println("Name of the oldest: " + oldName);

    }
}
