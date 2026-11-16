package JavaBasics;

public class PrimeAndFibonacci {
    public static void main(String[] args){
        int number = 27;
        boolean isPrime = true;
        if(number <= 1){
            isPrime = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(number+" is a prime number");
        }
        else{
            System.out.println(number+" is not a prime number");
        }
        //fibonacci numbers
        int n = 20;

        int fib1 = 0;
        int fib2 =1;

        System.out.println("Fibonacci numbers");

        for(int i = 1;i<=n;i++){
            System.out.print(fib1+" ");
            int fib3 = fib1+fib2;
            fib1 = fib2;
            fib2 = fib3;

        }

    }
}
