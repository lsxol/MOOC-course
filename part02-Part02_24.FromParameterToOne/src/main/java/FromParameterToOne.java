

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    public static void printFromNumberToOne(int number){
        int i = number;
        while(true){
            if(i == 0){
                break;
            }
            System.out.println(i);
            i--;
            
        }
    }

}
