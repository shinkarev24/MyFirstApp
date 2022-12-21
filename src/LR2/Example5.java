package LR2;

import java.util.Scanner;

public class Example5 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
            int x= in.nextInt();

            int result = x/1000;
            if (result>=1){
            System.out.println(result+" тыс.");}
            else System.out.println("В введенном числе меньше тысячи");
        }
    }
