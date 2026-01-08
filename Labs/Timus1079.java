import java.util.Scanner;

public class Timus1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int MAX_N = 200000;
        int[] a = new int[MAX_N];
        
        a[0] = 0;
        a[1] = 1;
        
        for (int i = 1; i < MAX_N / 2; i++) {
            a[2 * i] = a[i];
            if (2 * i + 1 < MAX_N) {
                a[2 * i + 1] = a[i] + a[i + 1];
            }
        }
        
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            
            int maxVal = 0;
            for (int i = 0; i <= n; i++) {
                if (a[i] > maxVal) {
                    maxVal = a[i];
                }
            }
            
            System.out.println(maxVal);
        }
        
        scanner.close();
    }
}