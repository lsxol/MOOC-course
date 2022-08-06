
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        for (int i = min; i <= max; i++){
            sum = sum + i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
