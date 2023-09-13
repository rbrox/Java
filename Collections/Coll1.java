package Collections;
import java.util.*;


public class Coll1 {
    public static void main(String args[]){
        System.out.print("Ola\n");

        ArrayList <Integer> arr = new ArrayList<>();
        
        arr.ensureCapacity(10);
        System.out.println(arr.size()+ " Al: " + arr );
        arr.add(4);
        System.out.println(arr.size() + " Al: " + arr );
        arr.add(5);
        System.out.println(arr.size()+ " Al: " + arr );

        Integer a[] = new Integer[20]; 
        a = arr.toArray(a);

        for(int x : a){
            System.out.println(x);
        }

    }
}
