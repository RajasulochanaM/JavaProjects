package JavaBasics;

public class StringImmutable {
        public static void main(String[] args) {

            //String Immutability
            String name = "Immut";

            System.out.println("Original String: " + name);

            name.concat("ability");

            System.out.println("After concat without assignment: " + name);

            name = name.concat("ability");

            System.out.println("After concat with assignment: " + name);


            //String Pool Behaviour
            String s1 = "Hello";
            String s2 = "Hello";

            System.out.println("String Pool Behaviour:");

            System.out.println("s1 == s2: " + (s1 == s2));


            //New String Object
            String s3 = new String("Hello");

            System.out.println("New String Object:");

            System.out.println("s1 == s3: " + (s1 == s3));


            //equals() Method
            System.out.println("Using equals():");

            System.out.println("s1.equals(s2): " + s1.equals(s2));

            System.out.println("s1.equals(s3): " + s1.equals(s3));
        }
}