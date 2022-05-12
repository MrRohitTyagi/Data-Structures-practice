import java.io.*;
import java.util.*;

public class Main {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int x = a.length;
    int y = b.length;
    int  size = x + y; 
    int [] ans = new int [size]; 
    int i = 0;
    int j = 0;
    int idx = 0;
    while(i < x && j < y){
        
        if(a[i]<b[j]){
            ans[idx++] = a[i++];
        }
        else{
            ans[idx++]= b[j++];
        }
    }
    while( i < x){
        ans[idx++] = a[i++]; 
    }
    while( j < y){
        ans[idx++] = b[j++]; 
    }
    
    
    
    return ans;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}