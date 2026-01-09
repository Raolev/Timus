import java.util.*;

public class Timus1022 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        // Граф: список смежности
        List<List<Integer>> graph = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Массив для подсчета количества родителей (входящих ребер)
        int[] inDegree = new int[N + 1];
        
        for (int i = 1; i <= N; i++) {
            while (true) {
                int child = scanner.nextInt();
                if (child == 0) {
                    break;
                }
                graph.get(i).add(child); // от i к child
                inDegree[child]++;
            }
        }
        
        // Очередь для вершин без родителей (входящих ребер)
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        // Алгоритм Кана (топологическая сортировка)
        while (!queue.isEmpty()) {
            int current = queue.poll();
            result.add(current);
            
            for (int child : graph.get(current)) {
                inDegree[child]--;
                if (inDegree[child] == 0) {
                    queue.offer(child);
                }
            }
        }
        
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}