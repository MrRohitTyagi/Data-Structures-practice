import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{ //lamda expression  // can also be donr with Collections.reverseOrder()
	        return b - a;
	    } );
	    for (int i = 1 ; i <= 10 ; i ++ ){
	        pq.add(i*10);
	    } 
	    System.out.println(pq.remove() );
	    
	}
}