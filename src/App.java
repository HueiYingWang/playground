import java.util.function.Function;

public class App {
      

    public static void main(String[] args) throws Exception {
    int balance;
    int newbalance;
    int amount;
    
    newbalance = returnADeposit(0,100);
    System.out.println(newbalance);
       
    }
    public static int returnAWithdraw(int balance, int amount) {
        int newbalance = balance-amount;
        return newbalance;
      }
    public static int returnADeposit(int balance, int amount) {
        int newbalance = balance+amount;
        return newbalance;
      }
    public static int returnATransfer(int balance, int amount) {
        int newbalance = balance-amount;
        return newbalance;
      }
    
}
