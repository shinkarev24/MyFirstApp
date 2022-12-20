package LR1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String dennedely = in.nextLine();

        System.out.println("Введите название месяца: ");
        String mesyac = in.nextLine();

        System.out.println("Введите число месяца: ");
        int nomerdnya = in.nextInt();

        System.out.println("День недели: " + dennedely);
        System.out.println("Число: " + nomerdnya);
        System.out.println("Месяц: " + mesyac);
        in.close();
    }
}
