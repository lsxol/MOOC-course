import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, pages, year));
            
        }
        
        System.out.println("What information will be prnted?");
        String info = scanner.nextLine();
        if (info.equals("everything")){
            for(int i = 0; i < books.size(); i++){
                System.out.println(books.get(i));
            }
        }
        
        if (info.equals("name")){
            for(int i = 0; i < books.size(); i++){
                System.out.println(books.get(i).getName());
            }
        }

    }
}
