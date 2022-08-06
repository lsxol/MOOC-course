
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double numbers = 0.0;
        while(true){
            System.out.println("Give a number: ");
            int num = scanner.nextInt();
            if(num > 0){
                sum = sum + num;
                numbers++;
            }else if(num < 0){
                ;
            }else{
                break;
            }
        }
        if (numbers == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(sum/numbers);
        }
    }
}
