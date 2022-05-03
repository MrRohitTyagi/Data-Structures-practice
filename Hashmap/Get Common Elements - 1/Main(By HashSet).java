import java.io.*;
import java.util.*;

public class Main {
    public static void input(int[] a ){
        
        for(int i = 0 ;i < a.length ;i++ ){
            a[i] = scn.nextInt();
        }
    }
    public static void ByHashSet(int[]a,int[]b){
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int ele : a){
            hs.add(ele);
        }
        for(int item : b){
            if(hs.contains(item) ){
                System.out.println(item);
                hs.remove(item);
            }
        }
    }
  public static Scanner scn = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    // write your code here

    int n1 = scn.nextInt();
    int [] a1 = new int[n1];
    input(a1);

    int n2 = scn.nextInt();
    int [] a2 = new int[n2];
    input(a2);
    ByHashSet(a1,a2);

  }

}