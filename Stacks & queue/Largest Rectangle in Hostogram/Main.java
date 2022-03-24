import java.util.*;
class Solution {
    
    
    public int largestRectangleArea(int[] h) {
        int max = 0;
        int []  STR = STright(h);
        int []  STL = STleft(h);
        
        for(int j = 0 ;j<h.length;j++){
            int w = STR[j]- STL[j] -1;
            int area = h[j]*w;
            max = Math.max(area,max);
            }
        return max;
        }
    
    
    public static int [] STright(int [] h){
        int [] ans = new int [h.length];
        int n = h.length;
        Arrays.fill(ans,h.length);
        
        Stack<Integer> st = new Stack<>();
        
        for(int i =0 ;i<h.length;i++){
            
            while(st.size()!= 0 && h[st.peek()]>h[i]){
                int  idx = st.pop();
                ans[idx] = i;
            }
            st.push(i);
        }
        return ans;
        
    }
    
    public static int [] STleft(int [] h){
        int [] ans = new int [h.length];
        int n = h.length;
        Arrays.fill(ans,-1);
        
        Stack<Integer> st = new Stack<>();
        
        for(int i =n-1 ;i>=0;i--){
            
            while(st.size()!= 0 && h[st.peek()]>h[i]){
                int  idx = st.pop();
                ans[idx] = i;
            }
            st.push(i);
        }
        return ans;
        
    }

    
}