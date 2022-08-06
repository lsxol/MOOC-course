
public class YourFirstAccount {

    public static void main(String[] args) {
        Account mine = new Account("Daniel", 100);
        mine.deposit(20);
        System.out.println(mine);
    }
}
