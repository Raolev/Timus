import java.math.BigInteger;
import java.util.Scanner;

public class Timus1012 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        BigInteger result = countCorrectNumbers(N, K);
        System.out.println(result);
    }
    
    public static BigInteger countCorrectNumbers(int N, int K) {
        if (N < 1) return BigInteger.ZERO;
        
        BigInteger[][] dp = new BigInteger[N + 1][2];
        
        dp[1][0] = BigInteger.ZERO;
        dp[1][1] = BigInteger.valueOf(K - 1);
        
        for (int i = 2; i <= N; i++) {

            dp[i][0] = dp[i - 1][1];
            
            dp[i][1] = dp[i - 1][0].add(dp[i - 1][1])
                      .multiply(BigInteger.valueOf(K - 1));
        }
        
        return dp[N][0].add(dp[N][1]);
    }
}