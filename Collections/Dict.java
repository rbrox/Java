package Collections;
import java.util.*;

public class Dict {
    public static void main(String args[]){
        Hashtable <Integer, Integer> dic = new Hashtable<Integer, Integer>();
        dic.put(1, 2);
        dic.put(2, 2);
        dic.put(1, 3);
        System.out.println(dic);
    }
}
