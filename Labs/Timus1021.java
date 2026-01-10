import java.io.*;
import java.util.*;

public class Timus1021 {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Читаем первый список
        int n1 = Integer.parseInt(br.readLine());
        int[] list1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            list1[i] = Integer.parseInt(br.readLine());
        }
        
        // Читаем второй список
        int n2 = Integer.parseInt(br.readLine());
        int[] list2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            list2[i] = Integer.parseInt(br.readLine());
        }
        
        int i = 0; // начало первого списка (возрастает)
        int j = 0; // начало второго списка (убывает)
        boolean found = false;
        
        while (i < n1 && j < n2) {
            int sum = list1[i] + list2[j];
            if (sum == 10000) {
                found = true;
                break;
            } else if (sum < 10000) {
                i++;
            } else { // sum > 10000
                j++;
            }
        }
        
        System.out.println(found ? "YES" : "NO");
    }
}