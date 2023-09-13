public class Arrays {
    public static void main(String args[]){
        //double arr[] = new double[10];//allocating memory using new
        //double arr2[] = {1, 2, 43};//Using array intialiser
        //int twod[][] = new int[2][2];

        int pyramid [][] = new int[5][];
        for (int i = 0; i < 5; ++i){
            pyramid[i] = new int[i + 1];
            for (int j = 0; j < i; ++j){
                pyramid [i][j] = j;
            }
        }

        for(int i =0; i < 5; ++i){
            for(int j = 0; j < i; ++j){
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
