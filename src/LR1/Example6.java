package LR1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String surname = in.nextLine();

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите отчество: ");
        String patronymic = in.nextLine();

        System.out.println("Привет!");

        System.out.println("Фамилия: " + surname );
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
        in.close();
    }
}
