class Test{
        int x;
        Test(int x){
            this.x = x;
        }
    }

public class Call {
    

    static void blah(int x){
        ++x;
        System.out.println(x);
    }
    static void blah(Test x){
        x.x += 10;
        System.out.println(x.x);
    }
    public static void main(String args[]){
        
        Test ob = new Test(10);
        System.out.println("Before: " + ob.x);
        blah(ob);
        System.out.println("After " + ob.x);
    }
}
