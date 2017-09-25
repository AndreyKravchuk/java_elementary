package ClassWork.Matrix;


import java.util.Arrays;

/**
 * Created by java6 on 25.09.17.
 */
public class MainMatrix {
    public static void main(String[] args) {


        int m = 10;
        int n = 15;
        int k = 25;


        int [][] matrix1 = new int[m][n];
        int [][] matrix2 = new int[n][k];

        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                matrix1[i][j] = 0;
            }
        }

        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[0].length; j++){
                matrix2[i][j] = 0;
            }
        }



        Multiplication multiplication = new Multiplication(matrix1,matrix2);
        System.out.println(multiplication.result());
    }
}
