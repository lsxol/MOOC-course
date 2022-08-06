
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int x = scanner.nextInt();
            if(x == -1){
                break;
            }
            counter++;
            list.add(x);
        }
        for(int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        System.out.println("Average: " + (1.0*sum/counter));
    }
}
