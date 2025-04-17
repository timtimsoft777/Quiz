
public class Exam4 {
        public static void main(String[] args) {
            BankAccount account = new BankAccount(100);
            Thread t1 = new Thread(() -> account.withdraw(70, "Thread-1"));
            Thread t2 = new Thread(() -> account.withdraw(50, "Thread-2"));
            t1.start();
            t2.start();
        }
    }

    class BankAccount {
        private int balance;
        public BankAccount(int balance) {
            this.balance = balance;
        }
        public synchronized void withdraw(int amount, String threadName) {
            System.out.println(threadName + " çıxmaq istəyir: " + amount + " AZN");

            if (balance >= amount) {
                System.out.println(threadName + ": kifayət qədər balans var, çıxılır...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= amount;
                System.out.println(threadName + ": yeni balans: " + balance + " AZN");
            } else {
                System.out.println(threadName + ": balans kifayət etmir! Mövcud: " + balance + " AZN");
            }
        }
    }


