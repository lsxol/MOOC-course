
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        if(x < 5000){
            System.out.println("No tax!");
        }else if(x >= 5000 && x < 25000){
            double tax = (x - 5000)*0.08 + 100;
            System.out.println("Tax: " + tax);
        }else if(x >= 25000 && x < 55000){
            double tax = (x - 25000)*0.1 + 1700;
            System.out.println("Tax: " + tax);
        }else if(x >= 55000 && x < 200000){
            double tax = (x - 55000)*0.12 + 4700;
            System.out.println("Tax: " + tax);
        }else if(x >= 200000 && x < 1000000){
            double tax = (x - 200000)*0.15 + 22100;
            System.out.println("Tax: " + tax);
        }else{
            double tax = (x - 1000000)*0.17 + 142100;
            System.out.println("Tax: " + tax);
        }
    }
}
