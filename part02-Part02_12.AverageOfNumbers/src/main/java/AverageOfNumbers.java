
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double numbers = 0.0;
        
        while(true){
            System.out.println("Give a number: ");
            int num = scanner.nextInt();
            if(num != 0){
                sum = sum + num;
                numbers++;
            }else{
                break;
            }
        }
        
        if(numbers > 0){
            double average = sum/numbers;
            System.out.println("Average of the numbers: " + average);
        }
    }
}
