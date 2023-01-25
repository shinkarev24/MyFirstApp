package LR6.example4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Factorial f = new Factorial();
        int n = r.nextInt(10);
        System.out.println("Число: " + n);
        int factorial1 = f.doublefactorial(n);
        int factorial2 = f.doublefact(n);
        System.out.println("Двойной факториал числа без рекурсии: " + factorial1);
        System.out.println("Двойной факториал числа с рекурсией: " + factorial2);

    }
}
