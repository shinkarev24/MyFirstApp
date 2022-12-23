package LR3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int x=in.nextInt();
        System.out.println("Введите второе целое число: ");
        int y=in.nextInt();
        if (x > y) {
            while (y <= x) {
                System.out.printf("%d, ", y);
                y++;}}
        else {
            while (x <= y) {
                System.out.printf("%d, ", x);
                x++;}}
        System.out.println(" КОНЕЦ!");}}

//МЕТОД С FOR
// if (x > y) {
//            for (int y1 = y; y1 <= x; y1++) {
//                System.out.printf("%d, ", y1);
//            }
//        } else {
//            for (int x1 = x; x1 <= y; x1++) {
//                System.out.printf("%d, ", x1);
//            }


