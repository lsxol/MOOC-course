
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Points points = new Points();
        
        UI ui = new UI(points,scanner);
        ui.start();
    }
}
