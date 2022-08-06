
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            String x = scanner.nextLine();
            if(x.equals("")){
                break;
            }
            items.add(new Item(x));
           
        }
        for(Item items1: items){
            System.out.println(items1);
        }

    }
}
