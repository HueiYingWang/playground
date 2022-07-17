import com.wiin.playgound.model.Account;

public class App {
      
    public static void main(String[] args) throws Exception {
        Account account = new Account(10);
        System.out.println(account.getBalance());

        account.setBalance(100);
        System.out.println(account.getBalance());

        account.deposit(1000);
        System.out.println(account.getBalance());

        account.withdraw(300);
        System.out.println(account.getBalance());

        account.transfer(600);
        System.out.println(account.getBalance()); 
    }
}
