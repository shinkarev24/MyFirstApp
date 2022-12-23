package LR3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        System.out.println("Размер массива равен " + size);
            int a = 1;
            int b = 0;
            int sum_fib;
            for (int i = 0; i < size; i++) {
                sum_fib = a + b;
                a = b;
                b = sum_fib;
                System.out.print(sum_fib + " ");
            }
        }
    }