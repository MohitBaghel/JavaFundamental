public class BankingSystemwithThread {

    public static void main(String[] args) {
       
        Banking banking = new Banking();

        Thread t1 = new Thread();
        for (int i = 0; i < 5; i++) {
           banking.deposit(10000);
           try {
            Thread.sleep(10000); // Sleep for 1 second
           } catch (Exception e) {
            // TODO: handle exception
           }
        }

       
    }

}
    class Banking {

        public int balance = 0; 

    public  synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
    


    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
        }
    }


    public int getBalance() {
        return balance;
}
 }


