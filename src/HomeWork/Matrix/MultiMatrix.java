package TestMatrix;

/**
 * Created by andrey.kravchuk on 26.09.2017.
 */
public class MultiMatrix {
    private int [][] matrix1;
    private int [][] matrix2;

    public MultiMatrix(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public int [][] multiMatrix(){
        int a = matrix1.length;
//        int b = matrix1[0].length;
//        int c = matrix2.length;
        int d = matrix2[0].length;
        int [][] multiMatrix = new int[a][d];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < d; j++){
                multiMatrix[i][j] = multiElement(i,j);
            }
        }

        return multiMatrix;
    }

    private int multiElement(int m, int k){
        int element = 0;
        for (int e = 0; e < matrix1[0].length; e++){
            element += matrix1[m][e] * matrix2[e][k];
        }
     return element;
    }

}
