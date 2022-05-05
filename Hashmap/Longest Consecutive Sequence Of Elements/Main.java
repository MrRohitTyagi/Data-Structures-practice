import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // step 0 : input vagarah
    Scanner scn = new Scanner(System.in);
    int n  = scn.nextInt();
    
    int[]a = new int[n];
    
    for(int i =0 ;i<n;i++){
        a[i]= scn.nextInt();
    }
    // step 1:creating a  hashmap
    
    HashMap<Integer,Boolean> hm = new HashMap<>();
    
    // step 2 : put all elements in HM with true
        
    for(int ele : a) {
        hm.put(ele,true);
    }       
    
    // step 3 : potential candidate dhundna
    for(int ele : a){
        if(hm.containsKey(ele - 1) ){
            hm.put(ele,false);
        }
    }
    // System.out.println(hm);
    
    // step 4 : work on potential candidates
    int len = 0;
    int PC = Integer.MIN_VALUE; //potential candidate
    
    for(int ele : a){
        if(hm.get(ele) == true ){
            int currLen = 1; //2 3 4 5 
            int currPC = ele; //4
            
            while(hm.containsKey(currPC + currLen)){
                currLen++;
            }
            if(currLen > len){
                len = currLen;
                PC = currPC;
            }
            
            
        }
        
    }
    for(int  i = PC ; i<PC+len;i++){
        System.out.println(i);        
    }
    
 }//main

}












