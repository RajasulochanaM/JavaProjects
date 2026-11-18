package OOPS.ImmutableClass;

final class AccountPin {

        private final int atmPin;
        private final String atmName;

        public AccountPin(int atmPin, String atmName) {
            this.atmPin = atmPin;
            this.atmName = atmName;
        }

        public int getPIN() {
            return atmPin;
        }

        public String getName() {
            return atmName;
        }
    }

    public class Main {

        public static void main(String[] args) {

            AccountPin acc = new AccountPin(2023, "SBI");

            System.out.println("ATM PIN: " + acc.getPIN());
            System.out.println("ATM Name: " + acc.getName());
        }
    }

