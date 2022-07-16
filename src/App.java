public class App {
      
    public static void main(String[] args) throws Exception {
        int balance = 0;
        System.out.println(balance);

        balance = deposit(balance, 5000);
        System.out.println(balance);

        balance = withdraw(balance, 100);
        System.out.println(balance);
        
        balance = transfer(balance, 10);
        System.out.println(balance);      
    }

    public static int deposit(int balance, int amount) {
        int newbalance = balance + amount;
        return newbalance;
    }

    public static int withdraw(int balance, int amount) {
        int newbalance = balance - amount;
        return newbalance;
    }

    public static int transfer(int balance, int amount) {
        int newbalance = balance - amount;
        return newbalance;
    }
}
