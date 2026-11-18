package OOPS.MethodOverloadingOverriding;

    class AddTwoString {

        // Method overloading
        String WordMerge(String word1, String word2) {
            return word1 + word2;
        }

        String WordMerge(String word1, String word2, String word3) {
            return word1 + word2 + word3;
        }
    }

    class Animal {

        // Parent method
        void sound() {
            System.out.println("Animal makes sound");
        }
    }

    class Dog extends Animal {

        // Method overriding
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public class Main {

        public static void main(String[] args) {

            AddTwoString merge = new AddTwoString();

            System.out.println(merge.WordMerge("Raja", "sulochana"));
            System.out.println(merge.WordMerge("archi", "tec", "ture"));

            Animal animal = new Dog();
            animal.sound();
        }
    }
