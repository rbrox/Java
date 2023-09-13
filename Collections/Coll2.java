package Collections;

import java.util.*;


public class Coll2 {
    public static void main(String args[]){
        System.out.print("Ola\n");



        LinkedList <Integer> lis = new LinkedList<>();

        
        //System.out.println(lis.size()+ " Al: " + lis );
        lis.push(12);
        //System.out.println(lis.size()+ " Al: " + lis );
        lis.push(12);
        lis.push(122);
        lis.push(142);
        lis.push(1562);
        
        Iterator <Integer> i = lis.iterator();
        while(i.hasNext()){
            Integer x = i.next() ;
            System.out.println(x);
        } 
             
        
                /* 
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
                */
    }
}
