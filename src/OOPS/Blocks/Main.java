package OOPS.Blocks;

public class Main {
        static int getResult() {

            try {
                System.out.println("Try block");
                return 100;
            }
            catch (Exception e) {
                System.out.println("Catch block");
                return 200;
            }
            finally {
                System.out.println("Finally block");
                return 300;
            }
        }

        public static void main(String[] args) {
            System.out.println("Result: " + getResult());
        }
}
