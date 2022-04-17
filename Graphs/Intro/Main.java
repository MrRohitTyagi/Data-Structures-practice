import java.lang.reflect.Constructor;
import java.util.*;

public class Main {
    public static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;

        }
    }
    public static void addEdge(ArrayList<Edge>[] graph,int u,int v , int wt){
        graph[u].add(new Edge(u, v, wt));
        graph[v].add(new Edge(v,u,wt));
    }

    public static void Construction(){
        int N =7 ;//number of nodes
        ArrayList<Edge>[] graph = new ArrayList[N];

        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        addEdge(graph, 0 , 1, 10);
        addEdge(graph, 0 , 3, 10);
        addEdge(graph, 1 , 2, 10);
        addEdge(graph, 2 , 3, 40);
        addEdge(graph, 3 , 4, 2);
        addEdge(graph, 4 , 5, 2);
        addEdge(graph, 5 , 6, 3);
        addEdge(graph, 4 , 6, 8);
        display(graph,N);
    }
    public static void display(ArrayList<Edge>[] graph, int ver){ // display a graph
        for(int i = 0 ; i < ver ; i++){
            System.out.print(i + "->");
            for(Edge e : graph[i]){
                int u  = e.src;
                int v = e.nbr;
                int w  = e.wt;
                System.out.print(u+"-"+ v +"-" + w + " ");
            }  
            System.out.println();      

    }
}

    public static void main(String [] args){
        Construction();

    }

}