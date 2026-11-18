package OOPS.Swallowing;

public class MainClass1 {

        static void validateAge(String age) {

            try {
                int studentAge = Integer.parseInt(age);

                System.out.println("Student Age: " + studentAge);
            }
            catch (NumberFormatException e) {

                // Exception is swallowed
            }
        }

        public static void main(String[] args) {

            validateAge("abc");

            System.out.println("Program completed");
        }
}

