
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        
        //Creates an account named "Matthews account" with the balance 1000
        //Creates an account named "My account" with the balance 0
        //Withdraws 100.0 from Matthew's account
        //Deposits 100.0 to "my account"
        //Prints both the accounts
        Account account = new Account("Matthews account", 1000);
        Account second = new Account("My account", 0);
        account.withdrawal(100);
        second.deposit(100);
        System.out.println(account);
        System.out.println(second);
    }
}
