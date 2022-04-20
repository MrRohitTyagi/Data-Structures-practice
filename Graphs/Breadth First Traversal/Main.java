import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
   
   static class pair{
       int val ;
       String psf;//path so far
       
       pair(int val , String psf){
           this.val = val;
           this.psf = psf;
           
       }
   }
   
   public static void bft( ArrayList<Edge>[] graph , int src){
       
       Queue<pair> q = new LinkedList<>();
       boolean [] ar = new boolean[graph.length];
       
       q.add(new pair(src,src+"") );
       
       while(q.size() != 0 ){
           pair rem = q.remove();
           if(ar[rem.val]== true ) continue;
           ar[rem.val] = true;
           
           System.out.println( rem.val + "@" + rem.psf  );
           
           for(Edge e : graph[rem.val]){
               int nbr = e.nbr;
               if(ar[nbr] == false){
               q.add(new pair(nbr,rem.psf+nbr) );
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());

      // write your code here  
      bft(graph,src);
   }
}