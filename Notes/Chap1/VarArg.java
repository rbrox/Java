public class VarArg {
    static void summ(int ... varArg){

            for(int x : varArg){
                System.out.print(x+ " ");
            }
        }
    public static void main(String args[]){
        summ(23, 1, 2, 3, 4, 78);
    }
}

