package LR2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int x= in.nextInt();
        boolean result = x % 5==2;
        System.out.println("Первый критерий: "+ result);
        boolean result2= x % 7==1;
        System.out.println("Второй критерий: "+ result2);
        if (result && result2){
            System.out.println("Введенное число удовлетворяет критериям");
        }
        else {
            System.out.println("Введенное число не удовлетворяет критериям");
        }
    }
}
