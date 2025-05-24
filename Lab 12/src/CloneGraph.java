import java.util.*;
class GraphNode {
    int val;List<GraphNode> neighbors;
    GraphNode(int val) {
        this.val = val;this.neighbors = new ArrayList<>();}}
public class CloneGraph {
    public static void main(String[] args) {
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);
        GraphNode clonedGraph = cloneGraph(node1);
        System.out.println("Original Node: " + node1.val);
        System.out.println("Cloned Node: " + clonedGraph.val);}
    public static GraphNode cloneGraph(GraphNode node) {
        if (node == null) return null;
        Map<GraphNode, GraphNode> map = new HashMap<>();
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        map.put(node, new GraphNode(node.val));
        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();
            for (GraphNode neighbor : current.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new GraphNode(neighbor.val));
                    queue.add(neighbor);}
                map.get(current).neighbors.add(map.get(neighbor));}}
        return map.get(node);}}
/*4. Clone a graph where each node has a value and a list of its neighbors.
        a)	Use BFS to traverse and clone each node and its neighbors while maintaining the graph structure.
b)	Ensure that all nodes are copied correctly and no node is visited more than once.*/