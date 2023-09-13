package Multi;
class Test implements Runnable{

    public void run(){
        System.out.println("lesgoooo");
    }
}

public class Thraed2 {
    public static void main(String args[]){
    Test t = new Test();
    t.run();
    }
}
