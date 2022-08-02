import java.io.*;
import java.util.*;

public class IsGraphBipartite {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        // write your code here
        boolean ans = isGraphBipartite(graph);
        System.out.println(ans);
    }

    public static class Pair {
        int vtx;
        int level;

        Pair(int vtx, int level) {
            this.vtx = vtx;
            this.level = level;
        }
    }

    public static boolean isGraphBipartite(ArrayList<Edge>[] graph) {
        int[] visited = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (visited[i] == 0) {
                boolean res = breadthFirstTravesal(graph, visited, i);
                if (!res)
                    return false;
            }
        }
        return true;
    }

    public static boolean breadthFirstTravesal(ArrayList<Edge>[] graph, int[] visited, int src) {
        ArrayDeque<Pair> queue = new ArrayDeque<>();

        queue.add(new Pair(src, 1));

        while (queue.size() > 0) {
            Pair rem = queue.remove(); // We get a pair of 0/1

            if (visited[rem.vtx] != 0) {
                if (visited[rem.vtx] != rem.level)
                    return false;
            }

            visited[rem.vtx] = rem.level;

            for (Edge e : graph[rem.vtx]) {
                if (visited[e.nbr] == 0) {
                    queue.add(new Pair(e.nbr, rem.level + 1));
                }
            }
        }

        return true;
    }
}
