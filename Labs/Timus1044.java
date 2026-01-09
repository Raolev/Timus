import java.util.Scanner;

public class Timus1044 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        int half = N / 2;
        
        int maxSum = 9 * half;
        
        long[] ways = new long[maxSum + 1];
        
        for (int i = 0; i <= 9; i++) {
            ways[i] = 1;
        }
        
        for (int digit = 1; digit < half; digit++) {

            long[] newWays = new long[maxSum + 1];
            

            for (int sum = 0; sum <= maxSum; sum++) {
                if (ways[sum] > 0) {

                    for (int d = 0; d <= 9; d++) {
                        int newSum = sum + d;
                        if (newSum <= maxSum) {
                            newWays[newSum] += ways[sum];
                        }
                    }
                }
            }
            

            ways = newWays;
        }
        
        long total = 0;
        for (int sum = 0; sum <= maxSum; sum++) {
            total += ways[sum] * ways[sum];
        }
        
        System.out.println(total);
    }
}