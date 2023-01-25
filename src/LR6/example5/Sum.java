package LR6.example5;

public class Sum {
    //нерек. метод
    static int sum(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++)
            result += (int) (Math.pow(i, 2));
        return result;
    }

    // рекурс. метод
    static int sumrekurs(int num) {
        if (num <= 1)
            return num;
        else
            return sumrekurs(num - 1) + num * num;
    }

}
