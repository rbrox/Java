package Collections;
import java.util.*;

class MyComp implements Comparator<Integer>{

    public int compare(Integer a, Integer b){
        if (b > a){
            return 1;
        }
        
        if (b == a){
            return 0;
        }
        else{
            return -1;
        }
    }
}

public class Comp {
    public static void main(String args[]){
        TreeSet <Integer> ts = new TreeSet<>(new MyComp());

        ts.add(1);
        ts.add(9);
        ts.add(323);
        ts.add(8);
        ts.add(5);
        System.out.println(ts);

        
    }
}
