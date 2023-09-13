package Multi;

import java.util.Scanner;

class Mehh {
    Scanner cs = new Scanner(System.in);
    String d = cs.nextLine();
}
class Call extends Thread{
    String mssg;
    Call(String msg){
        mssg = msg;
    }

    public void run(){
        System.out.print("[" + mssg);
        try{Thread.sleep(1000);
        }
        catch(InterruptedException e){

        }
        System.out.println("]");

    }
}

public class Thread3 {

    
    public static void main(String args[]){

        String arr[] = {"Hello", "Java", "Sucks"};

        for (int i = 0; i < 20; ++i){
            Call c = new Call(arr[i%3]);
            Thread t = c;
            t.start();
        }
    }
}
