import java.util.*;

public class Main {
    public static class pair{
        int val1;
        int val2;
        pair(){

        }
        pair(int val1, int val2){
            this.val1 = val1;
            this.val2 = val2;
        }
    }

    public static void main(String[] args) {
        // create
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // //reverse priority queue decending order

        // pq.add(50);
        // pq.add(10);
        // pq.add(8);
        // pq.add(20);
        // pq.add(80);
        // // pq.remove();
        // // int top = pq.peek();
        // // int size = pq.size();

        // // System.out.println(top);
        // // System.out.println(size);

        // while(pq.size() != 0){
        // System.out.println(pq.remove());
        // }
        // int [][] arr = { {2,3},{4,9},{5,1},{7,11} } ;
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->{ // lamda function
            return a.val1 - b.val1;
        });


        pq.add(new pair(2,3));
        pq.add(new pair(4,9));
        pq.add(new pair(-1,10));

       while(pq.size() != 0 ){
        pair rem = pq.remove();
        System.out.println(rem.val1 + " "+ rem.val2);
        // System.out.println(rem.val2);
       }
    }
}