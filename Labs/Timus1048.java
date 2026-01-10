import java.io.*;

public class Timus1048 {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] digits = new int[N]; // суммы цифр без учёта переноса
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            digits[i] = (line.charAt(0) - '0') + (line.charAt(2) - '0');
        }
        
        // Обрабатываем переносы справа налево
        for (int i = N - 1; i > 0; i--) {
            if (digits[i] >= 10) {
                digits[i] -= 10;
                digits[i - 1] += 1;
            }
        }
        
        // Первая цифра не может вызвать перенос за пределы по условию
        // digits[0] < 20, и если >=10, то просто выводим остаток
        
        char[] result = new char[N];
        for (int i = 0; i < N; i++) {
            result[i] = (char)((digits[i] % 10) + '0');
        }
        
        System.out.println(new String(result));
    }
}