import java.util.Scanner;

public class Timus1118 {
    static final int MAX = 1000000;
    static double[] triviality = new double[MAX + 1];

    static void precompute() {
        // Сначала сумма всех делителей
        long[] sumDiv = new long[MAX + 1];
        for (int i = 1; i <= MAX; i++) {
            for (int j = i; j <= MAX; j += i) {
                sumDiv[j] += i;
            }
        }
        // Тривиальность
        for (int n = 1; n <= MAX; n++) {
            long sumProper = sumDiv[n] - n;
            triviality[n] = (double) sumProper / n;
        }
    }

    public static void main(String[] args) {
        precompute();
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int J = scanner.nextInt();
        int bestN = I;
        double bestTriv = triviality[I];
        for (int n = I + 1; n <= J; n++) {
            if (triviality[n] < bestTriv) {
                bestTriv = triviality[n];
                bestN = n;
            }
        }
        System.out.println(bestN);
        scanner.close();
    }
}
