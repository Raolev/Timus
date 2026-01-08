import java.util.Scanner;

public class Timus1005 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] stones = new int[n];
        
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            stones[i] = scanner.nextInt();
            totalSum += stones[i];
        }
        
        int minDiff = Integer.MAX_VALUE;
        
        for (int mask = 0; mask < (1 << n); mask++) {
            int sum1 = 0;
            
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum1 += stones[i];
                }
            }
            
            int sum2 = totalSum - sum1;
            int diff = Math.abs(sum1 - sum2);
            
            if (diff < minDiff) {
                minDiff = diff;
                
                if (minDiff == 0) {
                    break;
                }
            }
        }
        
        System.out.println(minDiff);
        scanner.close();
    }
}