package LR6.example3;

public class Number {
    static void Min(int... array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
    }

    static void Max(int... array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
    }

    static void Avg(int... array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        double avg = (double) sum / array.length;
        System.out.println("Среднее значение: " + avg);
    }

}
