package OOPS.Swallowing;

public class MainClass2 {
        static void validateAge(String age) {

            try {
                int studentAge = Integer.parseInt(age);

                System.out.println("Student Age: " + studentAge);
            }
            catch (NumberFormatException e) {

                System.out.println("Error: Please enter a valid age");

                System.out.println("Exception: " + e.getMessage());
            }
        }

        public static void main(String[] args) {

            validateAge("abc");

            System.out.println("Program completed");
        }
}

