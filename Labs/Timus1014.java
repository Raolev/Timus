import java.util.Scanner;

public class Timus1014 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        if (N == 0) {
            System.out.println(10);
            scanner.close();
            return;
        }
        
        if (N == 1) {
            System.out.println(1);
            scanner.close();
            return;
        }
        
        if (N < 10) {
            System.out.println(N);
            scanner.close();
            return;
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int digit = 9; digit >= 2; digit--) {
            while (N % digit == 0) {
                result.append(digit);
                N /= digit;
            }
        }
        
        if (N != 1) {
            System.out.println(-1);
            
        } else {
            String answer = result.reverse().toString();
            
            try {
                long q = Long.parseLong(answer);
                System.out.println(q);
            } catch (NumberFormatException e) {
                System.out.println(-1);
            }
        }
        
        scanner.close();
    }
}