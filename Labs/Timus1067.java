import java.io.*;
import java.util.*;

public class Timus1067 {
	
    static class Node {
    	
        TreeMap<String, Node> children = new TreeMap<>();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Node root = new Node();

        for (int i = 0; i < N; i++) {
            String path = br.readLine();
            String[] parts = path.split("\\\\"); // экранируем обратный слеш
            Node current = root;
            for (String part : parts) {
                current.children.putIfAbsent(part, new Node());
                current = current.children.get(part);
            }
        }

        // Вывод дерева
        printTree(root, 0);
    }

    static void printTree(Node node, int depth) {
        for (Map.Entry<String, Node> entry : node.children.entrySet()) {
            // Печатаем отступ
            for (int i = 0; i < depth; i++) {
                System.out.print(" ");
            }
            System.out.println(entry.getKey());
            // Рекурсивная печать
            printTree(entry.getValue(), depth + 1);
        }
    }
}