
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age >= 0 && age <= 120){
            System.out.println("OK");
        }else{
            System.out.println("Impossible!");
        }
    }
}
