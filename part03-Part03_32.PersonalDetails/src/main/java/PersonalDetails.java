
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> all = new ArrayList<>();
        int count = 0;
        while(true){
            String x = scanner.nextLine();
            if(x.equals("")){
                break;
            }
            all.add(x);
            count = count + 1;
        }
        String[] allArray = new String[2];
        String[] names = new String[all.size()];
        int[] age = new int[all.size()];
        
        for(int i = 0; i < all.size(); i++){
            allArray = all.get(i).split(",");
            
            names[i] = allArray[0];
            age[i] = Integer.valueOf(allArray[1]);
        }    
        int oldNameLength = 0;
        int newNameLenght = 0;
        String longName = "";
        for(int i = 0; i < names.length; i++){
            oldNameLength = names[i].length();
            if(oldNameLength>newNameLenght){
                newNameLenght = oldNameLength;
                longName = names[i];
            }
            
        }
        int sum = 0;
        for(int i = 0; i < age.length; i++){
            sum = age[i] + sum;
        }
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + (1.0 * sum /count));
        

    }
}
