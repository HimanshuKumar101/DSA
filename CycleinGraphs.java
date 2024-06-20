import java.util.*;

/*
 * undirected dfs bfs dsu (disjoint set union)
 * 
 * directed dfs, bfs, topologica sort (kashni algorithm)
 * 
 * dfs -> vistied and loop
 * 
 * dfsutil -> kam
 * 
 * if neighbour is already visited then it can be cycle.
 * 
 * 
 * case 1 : vis[neigh] -> true
 * parx
 * 
 * case2: vis[neigh]    x condition;
 * par
 * 
 * case3: vis[neigh]x --> normal DFS
 *                            CALL(VIST)  CYCLE -> TRUE
 * 
 * 
 * to check current node is visited or not.
 * 
 * 
 * 
 * 
 */
public class CycleinGraphs {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }


    //O(V+E)
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {

        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph, vis, i, -1)) {
                    return true;
                    // cycle exists in one of the parts

                }
            }
        }
        return false;

    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {

        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // case 3

            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }

            }

            // case 1

            else if (vis[e.dest] && e.dest != par) {
                return true;
            }

            // case 2 -> do nothing - continue
        }

        return false;

    }

    public static void main(String[] args) {

        /*
         * 0-------3
         * / | |
         * / | |
         * 1 | 4
         * \ |
         * \ |
         * 2
         * 
         */

        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));

    }

}