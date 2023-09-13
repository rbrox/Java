public class Power2 {
    static long powerr(long num, int pow){
            long res = num;
            if (pow > 0){
                res = res << pow;
            }
            else{
                res = res >> -pow;
            }
            return res;
        }   
    public static void main(String args[]){
        System.out.println(powerr(2, 2));
        System.out.println(powerr(4, 2));
        System.out.println(powerr(64, -1));
        System.out.println(powerr(2, -1));
        System.out.println(powerr(2, 8));
    }
}
