package LR2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x= in.nextInt();

        int result = x % 4;
        System.out.println("result = "+ result);
        boolean result2= x>=10;
        System.out.println("Число не меньше 10 = "+ result2 );

        if (result==0&&result2){
            System.out.println("Введенное число делится на четыре без остатка и оно больше 10");
        }
        else if (result!=0&&x<10){
            System.out.println("Веденное число не делится на четыре без остатка и оно меньше 10");
        }
        else if (result==0){
            System.out.println("Веденное число делится на четыре без остатка, но оно меньше 10");
        }
        else{
            System.out.println("Веденное число не делится на четыре без остатка, но оно больше или равно 10");
        }
    }
}