package Multi;

class Shared {
    synchronized void print(String s){
        System.out.println("[" + s);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Caught");
        }finally{
            System.out.println("]");
        }
    }
}

class MyThread implements Runnable{
    Shared block;
    String s;

    MyThread(Shared mem ,String i){
        block = mem;
        s = i;
        Thread t = new Thread(this);
        t.start();
    }

    public void run(){
        block.print(s);
    }
} 

public class Thread4 {
    public static void main(String args[]){
        Shared mem = new Shared();

        MyThread t1 = new MyThread(mem, "Hello");
         MyThread t2 = new MyThread(mem, "World");
          MyThread t3 = new MyThread(mem, "Java");
    }
}
