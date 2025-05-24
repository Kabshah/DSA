import java.util.*;
public class GraphTraversal {
    public static void main(String[] args) {int vertices = 7;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());}
        graph.get(0).add(1); // 40 -> 20
        graph.get(0).add(3); // 40 -> 10
        graph.get(1).add(2); // 20 -> 50
        graph.get(1).add(4); // 20 -> 30
        graph.get(2).add(5); // 50 -> 70
        graph.get(4).add(3); // 30 -> 10
        graph.get(4).add(5); // 30 -> 70
        graph.get(4).add(6); // 30 -> 60
        graph.get(6).add(5); // 60 -> 70
        System.out.println("BFS Traversal:");
        bfs(0, graph, vertices);
        System.out.println("\nDFS Traversal:");
        boolean[] visited = new boolean[vertices];
        dfs(0, visited, graph);}
    public static void bfs(int start, ArrayList<ArrayList<Integer>> graph, int vertices) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        queue.add(start);visited[start] = true;
        while (!queue.isEmpty()) {int current = queue.poll();
            System.out.println("Visited Node: " + getNodeValue(current));
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;}}}}
    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
        visited[node] = true;
        System.out.println("Visited Node: " + getNodeValue(node));
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, graph);}}}
    public static int getNodeValue(int index) {
        int[] values = {40, 20, 50, 10, 30, 70, 60};
        return values[index];}}