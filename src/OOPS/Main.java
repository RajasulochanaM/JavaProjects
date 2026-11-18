package OOPS;

class SavingsAccount extends BankAccount {

        public SavingsAccount(String name, double balance) {
            super(name, balance);
        }

        @Override
        public void displayAccountType() {
            System.out.println("Savings Account");
        }
    }

    class CurrentAccount extends BankAccount {

        public CurrentAccount(String name, double balance) {
            super(name, balance);
        }

        @Override
        public void displayAccountType() {
            System.out.println("Current Account");
        }
    }

    public class Main {
        public static void main(String[] args) {

            BankAccount account1 =
                    new SavingsAccount("Rajasulochana", 10000);

            BankAccount account2 =
                    new CurrentAccount("Ilamadhi", 20000);

            account1.displayAccountType();
            account1.deposit(2000);
            System.out.println("Balance: " + account1.getBalance());

            account2.displayAccountType();
            account2.withdraw(5000);
            System.out.println("Balance: " + account2.getBalance());
        }
    }

