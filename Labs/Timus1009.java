import java.util.Scanner;

public class Timus1009 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        long result = countCorrectNumbers(N, K);
        
        System.out.println(result);
    }
    
    public static long countCorrectNumbers(int N, int K) {

        long[][] dp = new long[N + 1][K];
        
        for (int j = 1; j < K; j++) {
            dp[1][j] = 1;
        }
        dp[1][0] = 0;
        
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < K; j++) {

                if (j == 0) {

                    for (int prev = 1; prev < K; prev++) {
                        dp[i][j] += dp[i - 1][prev];
                    }
                } else {

                    for (int prev = 0; prev < K; prev++) {
                        dp[i][j] += dp[i - 1][prev];
                    }
                }
            }
        }
        
        long total = 0;
        for (int j = 0; j < K; j++) {
            total += dp[N][j];
        }
        
        return total;
    }
}