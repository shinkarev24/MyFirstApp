package LR1;

import java.util.Scanner;

public class Example9{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во дней в этом месяце: ");
        in.nextLine();
        System.out.println("Введите название месяца: ");
        String day= in.nextLine();
        switch (day) {
            case "Январь":
                System.out.println("В январе 31 день");
                break;
            case "Февраль":
                System.out.println("В феврале 28 дней");
                break;
            case "Март":
                System.out.println("В марте 31 день");
                break;
            case "Апрель":
                System.out.println("В апреле 30 день");
                break;
            case "Май":
                System.out.println("В мае 31 день");
                break;
            case "Июнь":
                System.out.println("В июне 30 день");
                break;
            case "Июль":
                System.out.println("В июле 31 день");
                break;
            case "Август":
                System.out.println("В августе 31 день");
                break;
            case "Сентябрь":
                System.out.println("В сентябре 30 день");
                break;
            case "Октябрь":
                System.out.println("В октябре 31 день");
                break;
            case "Ноябрь":
                System.out.println("В ноябре 30 день");
                break;
            case "Декабрь":
                System.out.println("В декабре 31 день");
                break;


        }
    }
}
