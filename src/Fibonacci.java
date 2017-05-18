import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number(1 - 20): ");
        int input = reader.nextInt();
        fibonacciSeries(input);
    }

    public static void fibonacciSeries(int number){
        int fib1 = 1;
        int fib2 = 1;

        System.out.printf("Fibonacci series of "+ number + " numbers: " );
        if(number <= 1){
            System.out.printf("%s ", fib1);
        } else if(number <= 2) {
            System.out.printf("%s ", fib1);
            System.out.printf("%s ", fib2);
        } else {
            System.out.printf("%s ", fib1);
            System.out.printf("%s ", fib2);
            for(int i = 2; i < number; i++){
                int fibonacci = fib1 + fib2;
                System.out.printf("%s ", fibonacci);
                fib2 = fib1;
                fib1 = fibonacci;
            }
        }


    }
}
