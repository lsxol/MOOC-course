
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figures> figures = new ArrayList();
        
        while(true){
            System.out.println("dawaj");
            String id = scanner.nextLine();
            if(id.isEmpty()){
                break;
            }
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            Figures figure = new Figures(name,id);
            
            if(!figures.contains(figure)){
                figures.add(figure);
            }
            
        }
        
        for(Figures figure:figures){
            System.out.println(figure);
        }

    }
}
