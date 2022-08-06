
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int x = scanner.nextInt();
        for (int i = 1; i <= x; i++){
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
