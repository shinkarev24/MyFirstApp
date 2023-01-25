package LR6.example5;

public class Main {
    public static void main(String[] args) {
        Sum s = new Sum();
        int summa1 = s.sum(3);
        int summa2 = s.sumrekurs(3);
        System.out.println("Сумма с рекурсией: " + summa1);
        System.out.println("Сумма без рекурсии: " + summa2);

    }
}
