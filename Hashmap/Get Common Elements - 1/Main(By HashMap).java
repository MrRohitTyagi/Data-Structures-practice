
import java.io.*;
import java.util.*;

public class Main {
    public static void input(int[] a ){
        
        for(int i = 0 ;i < a.length ;i++ ){
            a[i] = scn.nextInt();
        }
    }
    
    
    public static void ByHashMap(int [] a, int[] b){
            
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int ele: a){
            hm.put(ele,1);
        }
        
        for(int i : b){
            if(hm.containsKey(i) ){
                System.out.println(i);
                hm.remove(i);
            }
        }
    }
  public static Scanner scn = new Scanner(System.in);

  public static void main(String[] args) throws Exception {

    int n1 = scn.nextInt();
    int [] a1 = new int[n1];
    input(a1);

    int n2 = scn.nextInt();
    int [] a2 = new int[n2];
    input(a2);
    ByHashMap(a1,a2);

  }

}