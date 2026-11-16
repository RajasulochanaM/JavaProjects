package JavaBasics;

public class LargestAndSmallestArray {
    public static void main(String[] args){

                int[] numbers = {10, 25, 5, 40, 15, 2};

                int largest = numbers[0];
                int smallest = numbers[0];

                for (int i = 1; i < numbers.length; i++) {

                    if (numbers[i] > largest) {
                        largest = numbers[i];
                    }

                    if (numbers[i] < smallest) {
                        smallest = numbers[i];
                    }
                }

                System.out.println("Array elements:");

                for (int number : numbers) {
                    System.out.print(number + " ");
                }

                System.out.println("\nLargest element: " + largest);
                System.out.println("Smallest element: " + smallest);
    }
}
