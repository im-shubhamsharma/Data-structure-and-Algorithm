import java.io.*;
import java.util.*;

public class IsGraphCyclic {
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
        boolean ans = isGraphCyclic(graph);
        System.out.println(ans);
    }

    public static boolean isGraphCyclic(ArrayList<Edge>[] graph) {

        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (visited[i] == false) {
                boolean res = bft(graph, visited, i);
                if (res)
                    return true;
            }
        }

        return false;
    }

    public static boolean bft(ArrayList<Edge>[] graph, boolean[] visited, int src) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(src);

        while (queue.size() > 0) {
            int rem = queue.remove();
            if (visited[rem] == true)
                return true;
            visited[rem] = true;

            for (Edge e : graph[rem]) {
                if (visited[e.nbr] == false) {
                    queue.add(e.nbr);
                }
            }
        }

        return false;

    }
}
