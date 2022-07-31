import java.util.*;

public class graphConstruction{
    public static class Edge{
        int src, nbr, wt;

        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int vtces = sc.nextInt();
        int edgesCount = sc.nextInt();

        ArrayList<Edge> graph [] = new ArrayList[vtces];

        //initialization
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<edgesCount; i++){
            int v1 = sc.nextInt(), v2 = sc.nextInt(), wt = sc.nextInt();

            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        displayGraph(graph);
    }

    public static void displayGraph(ArrayList<Edge> graph[]){
        for(ArrayList<Edge> edges : graph){
            for(Edge e : edges){
                System.out.println(e.src + " -> " + e.nbr + " @ " + e.wt);
            }
        }

    }
}




/*
Input
7
8
0 3 3
0 1 10
1 2 1
2 3 2
3 4 4
4 5 5
5 6 6
4 6 6 
*/