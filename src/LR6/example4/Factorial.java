package LR6.example4;

public class Factorial {
    //рек.метод
    public static int doublefact(int num) {
        if (num == 0 || num == 1)
            return 1;

        return num * doublefactorial(num - 2);
    }
    //нерек.метод
    public static int doublefactorial(int num) {
        int result = 1;
        for (int i = num; i >= 0; i = i - 2) {
            if (i == 0 || i == 1)
                return result;
            else
                result *= i;
        }
        return result;
    }
}
