package Practice;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many fibonacci numbers do you want to see");
        int num = scanner.nextInt();

        fibonacci(num);
    }

    public static void fibonacci(int num) {

        int fibonacci = 0;
        int fibo1 = 1;
        int fibo2 = 1;

        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");

        for (int i = 1; i < num - 1; i++) {

            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci + " ");
        }


    }

}

