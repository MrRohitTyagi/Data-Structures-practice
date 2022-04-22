import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        HashSet<Integer> hs  = new HashSet<>();
        //add
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        System.out.println(hs);

        //remove
        hs.remove(30);
        System.out.println(hs);

        //size
        int size = hs.size();
        System.out.println(size);

        //get or find
        boolean is20 = hs.contains(20);
        boolean is80 = hs.contains(80); // 80 not present in the hs

        System.out.println(is20);
        System.out.println(is80);
        

    }
}