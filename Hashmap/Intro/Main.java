import java.util.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();

        //put      

        hm.put(4, 51);
        hm.put(1, 21);
        hm.put(3, 41);
        hm.put(2, 31);

        // get

        int val = hm.get(1);//gets value of correspondiong key
        int size = hm.size();

        System.out.println(val);
        System.out.println(size);
        
        boolean containsKey = hm.containsKey(1);
        int rem = hm.remove(1);

        System.out.println(containsKey); //true or false if key is present

        System.out.println(rem);

        System.out.println(hm);

         System.out.println( hm.keySet() ); 

    }
}