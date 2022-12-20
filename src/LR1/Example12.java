package LR1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int vozrast = in.nextInt();
        System.out.println("Ваш год рождения: " + getAge(vozrast));
    }

    private static int getAge(int vozrast) {
        return 2022 - vozrast;
    }
}