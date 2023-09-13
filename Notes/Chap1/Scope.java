/*
 herein we dicuss the scope of java and how it works
 {} -> block 
 */
public class Scope {
    public static void main(String args[]){
        int x = 10;

        if (x == 10){
            int y = 20;
            System.out.println(x + " " + y);
            System.out.println(x + y);
        }

        //System.out.println(x + " " + y);
    }
}
