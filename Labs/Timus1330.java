import java.io.*;
import java.util.StringTokenizer;

public class Timus1330 {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());
        long[] prefix = new long[N + 1];

        // Чтение данных и построение префиксных сумм
        for (int idx = 1; idx <= N; idx++) {
            int value = Integer.parseInt(br.readLine());
            prefix[idx] = prefix[idx - 1] + value;
        }

        int Q = Integer.parseInt(br.readLine());
        for (int q = 0; q < Q; q++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            // Сумма на отрезке [i, j]
            long sum = prefix[j] - prefix[i - 1];
            pw.println(sum);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}