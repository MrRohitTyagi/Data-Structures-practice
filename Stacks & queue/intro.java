import java.util.*;
public class intro
{
	public static void main(String[] args) {
		//stack create
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(14);
		st.push(645);
		st.push(46);
		st.push(325);
		st.pop();
        st.peek();
		
		System.out.println(st);
        int size = st.size();
        int cap = st.capacity();
		System.out.println(size);
		System.out.println(cap);

        

        
	}
}