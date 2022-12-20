package LR1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();
        int r = a+b;
        System.out.println("сумму: "+  r);
        System.out.println("разность: "+  (a-b));
    }
}
