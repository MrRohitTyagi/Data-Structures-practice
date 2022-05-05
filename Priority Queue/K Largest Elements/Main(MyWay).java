import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
      if(k > arr.length){
          return;
      }
      
      Arrays.sort(arr);
      
      
      for(int i = arr.length - k ; i< arr.length ; i++){
          System.out.println(arr[i]);
      }
    }

}