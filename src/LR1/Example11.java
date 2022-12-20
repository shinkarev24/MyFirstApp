package LR1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = in.nextLine();
        System.out.print("Год рождения: ");
        int year = in.nextInt();
        System.out.println( name + ", " + "ваш возраст: " + getAge(year));
    }

    private static int getAge(int year){
        return 2022 - year;
    }
}
