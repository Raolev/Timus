import java.util.Scanner;

public class Timus1120 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();
        long twoS = 2 * S;
        
        long bestN = -1, bestA = -1;
        
        // Перебираем возможные N от макс вниз
        // N <= sqrt(2S) примерно, но на самом деле N может быть до 2S
        
        for (long N = 1; N * N <= twoS; N++) {
            if (twoS % N == 0) {
                // Два делителя: N и twoS/N
                long[] divisors = {N, twoS / N};
                for (long d : divisors) {
                    long N1 = d;
                    long d1 = twoS / d;  // Это наш d из уравнения
                    // d1 = 2A + N1 - 1
                    long twoA = d1 - N1 + 1;
                    if (twoA > 0 && twoA % 2 == 0) {
                        long A = twoA / 2;
                        if (A >= 1) {
                            // Выбираем максимальное N1
                            if (N1 > bestN) {
                                bestN = N1;
                                bestA = A;
                            }
                        }
                    }
                }
            }
        }
        
        System.out.println(bestA + " " + bestN);
        scanner.close();
    }
}