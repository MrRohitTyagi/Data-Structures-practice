import java.io.*;
import java.util.*;

public class Main{
    public static int calc(int v1,int v2,char ch){
        if(ch == '+'){
            return v2+v1;
        }
        else if(ch == '*'){
            return v2*v1;
        }
        else if(ch == '/'){
            return v2/v1;
        }
        else if(ch == '-'){
            return v2-v1;
        }
        return 0;
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<String> inf = new Stack<>();
    Stack<String> pre = new Stack<>();
    Stack<Integer> eval = new Stack<>();
    
    for(int i =0 ;i<exp.length() ; i++){
        char ch = exp.charAt(i);
        
        if(ch >='0' && ch<='9'){
            inf.push(ch+"");
            eval.push(ch-'0');
            pre.push(ch+"");
        }
        else if(ch == '+' || ch == '/' || ch == '*' || ch == '-'){
            
            int evalV2 = eval.pop();
            int evalV1 = eval.pop();
            int ans = calc(evalV2,evalV1,ch);
            eval.push(ans);
            ///////// prefix
            String preV2 = pre.pop();
            String preV1 = pre.pop();
            
            String preAns =  ch+preV1 +preV2;
            pre.push(preAns);
            /////////// infix 
            
            String infV2 = inf.pop();
            String infV1 = inf.pop();
            
            String infAns =  infV1+ch +infV2;
            inf.push('('+infAns+')');
        }
        
        
    }//for
    
    System.out.println(eval.peek() );
    System.out.println(inf.peek() );
    System.out.println(pre.peek() );
 }
}