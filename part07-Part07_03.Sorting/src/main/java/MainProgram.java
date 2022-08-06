
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int val1 = MainProgram.indexOfSmallestFrom(array, 0);
        int val2 = MainProgram.indexOfSmallestFrom(array, 1);
        int val3 = MainProgram.indexOfSmallestFrom(array, 2);
        int val4 = MainProgram.indexOfSmallestFrom(array, 3);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
    }
    
    public static int smallest(int[] array){
        int small = array[0];
        for(int i = 0; i < array.length; i++){
            if(small > array[i]){
                small = array[i];
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array){
        int small = array[0];
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(small >= array[i]){
                small = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int small = array[startIndex];
        int index = -1;
        for(int i = startIndex; i < array.length; i++){
            if(small >= array[i]){
                small = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
        
        
        int swap1 = array[index1];
        array[index1] = array[index2];
        array[index2] = swap1;
        
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int swap1 = array[i];
            int index = MainProgram.indexOfSmallestFrom(array, i);
            array[i] = array[MainProgram.indexOfSmallestFrom(array, i)];
            array[index] = swap1;
            System.out.println(Arrays.toString(array));
            
        }
        
    }
    
    
}


