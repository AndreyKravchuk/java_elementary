package ClassWork.Matrix;

/**
 * Created by java6 on 25.09.17.
 */
public class Multiplication {
    private int [][] matrix1;
    private int [][] matrix2;




    public Multiplication(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;

    }

    public int [][] result(){

        int count = 0;
        int[][] matrix = new int[matrix1.length][matrix2[0].length];


        while (count < matrix2.length) {
            for (int v = 0; v < matrix.length; v++) {
                count += 1;
                for (int h = 0; h < matrix[0].length; h++) {
                    matrix[v][h] = 0;
                }
            }

        }
        return matrix;
    }




}
