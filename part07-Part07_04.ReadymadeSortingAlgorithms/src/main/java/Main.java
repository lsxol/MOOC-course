
import java.util.ArrayList;
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        Main.sort(array);
        System.out.println(Arrays.toString(array));
        String[] arrayS = {"dupa", "chuj", "cipa", "cwel"};
        Main.sort(arrayS);
        System.out.println(Arrays.toString(arrayS));
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
    }
    
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers){
        integers.sort(null);
    }
    public static void sortStrings(ArrayList<String> strings){
        strings.sort(null);
    }
    
    

}
