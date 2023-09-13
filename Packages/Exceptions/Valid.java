package Exceptions;

public class Valid {
    public static void main(String args[]){
        

        try{
            int x = 0;
            int y = 5/x;
        }
        catch(ArithmeticException e){
            System.out.println("Hahahh");
        }
        catch( Throwable e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
    }
}
