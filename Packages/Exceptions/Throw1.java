package Exceptions;

public class Throw1 {

    class CustomException extends Throwable{
        CustomException(String s){
            System.out.println("Muhahhahhahha");
        }
    }

    public static void main(String args){
        throw new CustomException("bugga");
    }
}
