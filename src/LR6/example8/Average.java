package LR6.example8;

public class Average {
    static double SetAvg(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double result = (double) sum / arr.length;
        return result;
    }

}
