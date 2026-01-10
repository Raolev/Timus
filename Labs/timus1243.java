package project1;

import java.math.BigInteger;
import java.util.Scanner;

public class timus1243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine().trim();
        
        BigInteger n = new BigInteger(input);
        BigInteger gnom = BigInteger.valueOf(7);
        
        BigInteger veshi = n.mod(gnom);
        
        System.out.println(veshi);
        
        scanner.close();
    }
}