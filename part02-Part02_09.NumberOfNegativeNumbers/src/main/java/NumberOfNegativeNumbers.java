
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        while(true){
            System.out.println("Give a number: ");
            int num = scanner.nextInt();
            if(num < 0){
                numbers++;
            }else if(num == 0){
                break;
            }
        }
        System.out.println("Number of negative numbers: " + numbers);
    }
}
