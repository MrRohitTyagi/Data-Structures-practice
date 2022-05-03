import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i < s.length();i++ ){
            char ch = s.charAt(i);
            
            if(hm.containsKey(ch) == true){
                int get = hm.get(ch) + 1;
                hm.put(ch,get);
            }
            else{
                hm.put(ch,1);
            }
            
                
        }
        int max = -1;
        char maxch = '*';
        for(Character c : hm.keySet() ){
            int val = hm.get(c);
            if(val > max){
                max = val;
                maxch = c;
            }
            
        }
        System.out.print(maxch);
    }

}






