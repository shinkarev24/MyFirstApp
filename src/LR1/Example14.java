package LR1;


import java.util.Scanner;

public class Example14 {
        public static void main(String[] args) {
                Scanner in= new Scanner(System.in);
                System.out.println("Введите число: ");
                int chislo=in.nextInt();
                int a=chislo-1, c= chislo+1, d= (a+chislo+c)*(a+chislo+c);
                System.out.println(a);
                System.out.println(chislo);
                System.out.println(c);
                System.out.println(d);

        }
        }