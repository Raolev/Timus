import java.util.Scanner;

	public class Timus1131 {
		
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        long N = scanner.nextLong();
	        long K = scanner.nextLong();

	        long hours = 0;
	        long computers = 1;

	        // Фаза экспоненциального роста
	        while (computers < K && computers < N) {
	            computers *= 2;
	            hours++;
	        }

	        // Фаза линейного роста
	        if (computers < N) {
	            long remaining = N - computers;
	            hours += (remaining + K - 1) / K;
	        }

	        System.out.println(hours);
	        scanner.close();
	    }
	}