package project1;

import java.util.Scanner;

public class timus1293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        long result = (long)N * A * B * 2;
        
        System.out.println(result);
        
        scanner.close();
    }
}