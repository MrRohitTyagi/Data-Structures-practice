import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        Stack<Integer>st = new Stack<>();
        int n = arr.length;
        
        for(int i = 0 ;i <n;i++){
            st.push(i);
        }
        
        while(st.size()>=2  ){
            int v2 = st.pop();
            int v1 = st.pop();
            
            if(arr[v1][v2] == 1){
                st.push(v2);
            }
            else{
                st.push(v1);
            }
        }
        
        int pc = st.pop();
        boolean ans = true;
        
        // col check
        for(int i = 0; i<n; i++){
            if(pc != i && arr[i][pc] == 0){
                ans = false;
                break;
            }
        }
        
        //row check
         for(int i = 0; i<n; i++){
            if(pc != i && arr[pc][i] == 1){
                ans = false;
                break;
            }
        }
        
        if(ans == true)
            System.out.println(pc);
        else
            System.out.println("none");
        
    }

}










