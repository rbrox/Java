package Multi;
class Test implements Runnable{
    public void run(){
        System.out.println("lesgoooo");
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
    }

public class Thread1 {
    
    static void thread_info(Thread curr){
        System.out.println(curr);
        System.out.println(curr.getName());
        System.out.println(curr.getId());
        System.out.println(curr.getPriority());
        System.out.println(curr.isAlive());

    }
    public static void main(String args[]){
        Test curr = new Test();
        
        curr.run();

    }
}
