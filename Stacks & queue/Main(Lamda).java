import java.util.*;
public class Main{

public static void main(String[] args) {
    int [] arr1 = {1,2,3,4,5,6,7,18,34,56,12,76,43};
    int [][] arr  = {{1,4},
                     {5,7},
                     {3,12},
                     {18,2},
                     {6,10}};
    
        Arrays.sort(arr,(a,b)->{
            return a[0]-b[0];
        });
    
    for(int [] i:arr){
        System.out.println(i[0]+" " +i[1] );
    }        
}
}
