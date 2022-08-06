
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int x = scanner.nextInt();
            if(x==9999){
                break;
            }
            list.add(x);
        }
        int dupa = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(dupa > list.get(i)){
                dupa = list.get(i);
            }
        }
        System.out.println("Smallest number: " + dupa);
        for(int i = 0; i < list.size(); i++){
            if(dupa == list.get(i)){
                System.out.println("Found at index: " + i);
            }
        }
        
    }
    
}
