package JavaBasics;

public class SwappingTwoNumbers {

    public static void main(String[] args) {
        int a = 20, b = 5;
        System.out.println("Before Swapping: a:" + a + ", b:" + b);

        // using third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping with third variable:");
        System.out.println("a:" + a + ", b:" + b);

        // reset to original values
        a = 20;
        b = 5;

        // without using third variable (XOR)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping without third variable:");
        System.out.println("a:" + a + ", b:" + b);
    }
}