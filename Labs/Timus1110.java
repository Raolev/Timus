import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Timus1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Y = scanner.nextInt();
        
        ArrayList<Integer> results = new ArrayList<>();
        
        for (int X = 0; X < M; X++) {

            long power = 1;
            for (int i = 0; i < N; i++) {
                power = (power * X) % M;
            }
            
            if (power % M == Y) {
                results.add(X);
            }
        }
        
        if (results.isEmpty()) {
            System.out.println(-1);
        } else {

            for (int i = 0; i < results.size(); i++) {
                System.out.print(results.get(i));
                if (i < results.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}