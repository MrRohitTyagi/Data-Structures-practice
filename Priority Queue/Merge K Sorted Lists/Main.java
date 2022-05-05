import java.io.*;
import java.util.*;

public class Main {
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> arr){
      ArrayList<Integer> rv = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int i =0 ; i < arr.size() ; i++ ){
          int k = arr.get(i).size(); 
          for(int j = 0 ; j<k;j++){
              pq.add(arr.get(i).get(j));
          }
          
      }
    //   System.out.println(pq);
      while(pq.size()!= 0 ){
          rv.add(pq.remove() );
      }

      return rv;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}