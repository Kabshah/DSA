import java.util.*;
public class LabTask {
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());}
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(2).add(4);
        graph.get(1).add(2);
        System.out.println("BFS Traversal:");
        bfs(0, graph, vertices);
        System.out.println("\nDFS Traversal:");
        boolean[] visited = new boolean[vertices];
        dfs(0, visited, graph);}
    public static void bfs(int start, ArrayList<ArrayList<Integer>> graph, int vertices) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {int current = queue.poll();
            System.out.println("Visited Node: " + current);
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;}}}}
    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
        visited[node] = true;
        System.out.println("Visited Node: " + node);
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, graph);}}}}