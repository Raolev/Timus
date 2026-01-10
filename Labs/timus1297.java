package project1;

import java.util.Scanner;

public class timus1297 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        int n = s.length();
        String longestPalindrome = "";
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    if (sub.length() > longestPalindrome.length() || 
                       (sub.length() == longestPalindrome.length() && i < s.indexOf(longestPalindrome))) {
                        longestPalindrome = sub;
                    }
                }
            }
        }
        
        System.out.println(longestPalindrome);
    }
    
    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}