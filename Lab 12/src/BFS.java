import java.util.*;
public class BFS {
    public static void main(String[] args) {
        int vertices = 5; // Number of vertices in the graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());}
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        bfs(graph, vertices, 0);}
    public static void bfs(ArrayList<ArrayList<Integer>> graph, int vertices, int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.println("Visited: " + current);
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;}}}}}
/*2.write in java Follow the below instructions to implement BFS traversal.
a)	Declare a queue and insert the starting vertex.
b)	Initialize a visited array and mark the starting vertex as visited.

Follow the below process till the queue becomes empty:
a)	Remove the first vertex of the queue.
        b)	Mark that vertex as visited.
        c)	Insert all the unvisited neighbors of the vertex into the queue.*/