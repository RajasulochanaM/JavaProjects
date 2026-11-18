package OOPS.AbstractClassAndInterface;

    abstract class Payment {

        protected double amount;

        Payment(double amount) {
            this.amount = amount;
        }

        abstract void processPayment();

        void showAmount() {
            System.out.println("Payment Amount: " + amount);
        }
    }

    interface Refundable {

        void refund(double amount);
    }

    class CreditCardPayment extends Payment
            implements Refundable {

        CreditCardPayment(double amount) {
            super(amount);
        }

        @Override
        void processPayment() {
            System.out.println("Payment through Credit Card");
        }

        @Override
        public void refund(double amount) {
            System.out.println("Refunded: " + amount);
        }
    }

    public class Main {

        public static void main(String[] args) {

            CreditCardPayment payment =
                    new CreditCardPayment(5000);

            payment.showAmount();
            payment.processPayment();
            payment.refund(1000);
        }
    }
