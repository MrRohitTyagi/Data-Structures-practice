import java.io.*;
import java.util.*;

public class Main {
    static class pair {
      int s; //src
      int p; // parent
      int cost;
      
        pair(){}
      pair(int s, int p,int cost) {
         this.s  = s;
         this.p = p;
         this.cost = cost;
      }
         
      }
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
   
   public static void prims(ArrayList<Edge>[] graph){
       int n  = graph.length;
       
       PriorityQueue<pair> p = new PriorityQueue<>((a,b)->{
           return a.cost - b.cost;
       });
       boolean [] vis  = new boolean[n];
       
       p.add(new pair(0,-1,0)) ;
       
       while( p.size() != 0 ){
            pair rem = p.remove();
            
            if(rem.p != -1 && vis[rem.s] == false){
                System.out.println("["+ rem.s + "-" +rem.p +"@"+rem.cost+"]");
            }
            vis[rem.s] = true;
            
            for(Edge e : graph[rem.s]){
                int nbr = e.nbr;
                
                if(vis[nbr] == false){
                    p.add(new pair(nbr,rem.s,e.wt));
                }
            }
            
            
           
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

      // write your code he
      prims(graph);
   }

}