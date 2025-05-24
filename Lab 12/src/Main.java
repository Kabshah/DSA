import java.util.*;
public class Main {
    private Map<Integer, List<Integer>> graph;
    public Main() {graph = new HashMap<>();}
    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);}  // For undirected graph
    // BFS traversal method
    public void bfs(int start) {
        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        // Visited array to track visited vertices
        boolean[] visited = new boolean[graph.size()];
        // Step 1: Insert the starting vertex into the queue and mark as visited
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            // Step 2: Remove the first vertex from the queue
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            // Step 3: Insert all unvisited neighbors into the queue
            for (int neighbor : graph.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true; // Mark the neighbor as visited
                    queue.add(neighbor);}}}}
    public static void main(String[] args) {
        Main bfsTraversal = new Main();
        bfsTraversal.addEdge(0, 1);
        bfsTraversal.addEdge(0, 2);
        bfsTraversal.addEdge(1, 3);
        bfsTraversal.addEdge(1, 4);
        bfsTraversal.addEdge(2, 5);
        bfsTraversal.addEdge(2, 6);
        System.out.println("BFS Traversal starting from vertex 0:");
        bfsTraversal.bfs(0);}}