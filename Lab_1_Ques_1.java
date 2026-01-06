public class Main {
    static class Bank {
        double amount;
        Bank(double amount) {
            this.amount = amount;
        }
        void withdraw(double withdrawalAmount) {
            String message = (withdrawalAmount <= amount) 
                                ? "Withdrawal successful" 
                                : "Insufficient balance";
            System.out.println(message);
            amount = (withdrawalAmount <= amount) 
                        ? amount - withdrawalAmount 
                        : amount;
        }
        void deposit(double depositAmount) {
            amount += depositAmount;
            System.out.println("Deposited: " + depositAmount);
        }
        void displayBalance() {
            System.out.println("Total balance: " + amount);
        }
    }
    public static void main(String[] args) {
        Bank acc = new Bank(10000);
        acc.withdraw(3000);
        acc.deposit(5000);
        acc.displayBalance();
    }
}