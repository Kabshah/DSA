import java.util.*;
public class GraphDFS {
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());}
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS Traversal:");
        dfs(0, visited, graph);}
    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
        visited[node] = true;
        System.out.println("Visited Node: " + node);
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, graph);}}}}
/*2. Write a JAVA program that creates a recursive function that takes the index of the node and
a visited array. Mark the current node as visited and print the node and traverse all the adjacent and
unmarked nodes and call the recursive function with the index of the adjacent node.
 */

