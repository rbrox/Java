package Collections;
import java.util.*;

public class Others {
    public static void main(String args[]){
        Random r = new Random(0);
        StringTokenizer s = new StringTokenizer("Hello Woerl", " ", false);

        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
    }
}
