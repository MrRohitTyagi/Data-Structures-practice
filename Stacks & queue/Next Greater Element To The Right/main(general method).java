import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   int[] num = new int[arr.length];
   
   for(int i = 0;i<arr.length ; i++){
       int val = arr[i];
       for(int j = i;j<arr.length;j++){
           int ch = arr[j];
           
           if(ch > val){
               num[i] = ch;
               break;
           }
           else{
               num[i] = -1;
           }
       }
   }
   return num;
 }

}

















